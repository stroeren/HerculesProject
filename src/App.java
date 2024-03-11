import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;

public class App extends GameApplication {

    @Override
    protected void initSettings(GameSettings settings) {
        settings.setTitle("My Game");
        settings.setVersion("0.1");
        settings.setWidth(800); // Set the width of the window
        settings.setHeight(600); // Set the height of the window
    }

    public static void main(String[] args) {
        launch(args);
    }
}