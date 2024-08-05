package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUserName().equals(login)) {
                return users[i];
            }
        }
        throw new UserNotFoundException("Пользователь не найден");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("Пользователь не валидный");
        }
        if (user.getUserName().length() < 3) {
            throw new UserInvalidException("Имя пользователя состоит из менее трех символов");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        try {
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("У этого пользователя есть доступ.");
            }
        } catch (UserInvalidException e) {
            throw new RuntimeException(e);
        } catch (UserNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
