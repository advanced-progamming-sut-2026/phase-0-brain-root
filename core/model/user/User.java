package core.model.user;

import core.model.game.GameSettings;
import core.util.PasswordHasher;
import core.model.user.enums.Gender;
import core.model.game.player.Inventory;
import core.model.game.player.Wallet;

public class User
{
    private String username;
    private String passwordHash;
    private String nickname;
    private Gender gender;
    private String email;
    private Wallet wallet = new Wallet();
    private Inventory inventory = new Inventory();
    private UserStats userStats = new UserStats();
    private GameSettings gameSettings = new GameSettings();

    public User(String username, String password, String nickname, Gender gender, String email)
    {
        this.username = username;
        this.passwordHash = PasswordHasher.hash(password);
        this.nickname = nickname;
        this.gender = gender;
        this.email = email;
    }
}
