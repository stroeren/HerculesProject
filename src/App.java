
import com.almasb.fxgl.dsl.FXGL;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.input.UserAction;
import static com.almasb.fxgl.dsl.FXGL.getAppHeight;
import static com.almasb.fxgl.dsl.FXGL.getAppWidth;
import static com.almasb.fxgl.dsl.FXGL.getGameController;
import static com.almasb.fxgl.dsl.FXGL.getGameWorld;
import static com.almasb.fxgl.dsl.FXGL.onBtnDown;
import static com.almasb.fxgl.dsl.FXGL.onCollisionBegin;
import static com.almasb.fxgl.dsl.FXGL.onKey;
import static com.almasb.fxgl.dsl.FXGL.run;
import static com.almasb.fxgl.dsl.FXGL.showMessage;
import static com.almasb.fxgl.dsl.FXGL.spawn;
import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.entity.Entity;
import com.almasb.fxgl.entity.EntityFactory;
import javafx.scene.input.KeyCode;
import javafx.scene.input.MouseButton;
import javafx.util.Duration; 

public class App extends GameApplication {

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setTitle("My Game");
        settings.setVersion("0.1");
        settings.setWidth(1000); // Set the width of the window
        settings.setHeight(800); // Set the height of the window
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    protected void initGame() {
        FXGL.entityBuilder()
            .at(300, 300) // Set the initial position of the player
            .view("player.png") // Set the player's sprite or view
            .buildAndAttach();
    }
    
    @Override
    protected void initInput() {
        Entity player = FXGL.entityBuilder()
            .at(0, 0)
            .buildAndAttach();

        FXGL.getInput().addAction(new UserAction("Move Right") {
            @Override
            protected void onAction() {
                player.translateX(5); // Move the player 5 units to the right
            }
        }, KeyCode.D); // Bind the action to the D key
    }
    @Override
    protected void onUpdate(double tpf) {
        // Game logic here, executed every frame
    }
    
}