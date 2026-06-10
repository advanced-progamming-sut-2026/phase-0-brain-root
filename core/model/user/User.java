package core.model.user;

import core.model.game.GameSettings;
import core.model.game.player.Player;
import core.util.PasswordHasher;
import core.model.user.enums.Gender;
public class User
{
    private String username;
    private String passwordHash;
    private String nickname;
    private Gender gender;
    private String email;
    private Player player = new Player();
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
