package Tasks;


import Configuration.LaunchBrowser;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


public class YoutubeVedioPlayAndPause
{
    public static void main(String[] args) throws FindFailed, InterruptedException {
        WebDriver driver= LaunchBrowser.ChromeBrowser();
        driver.get("https://www.youtube.com/watch?v=ATm0cWqowxE");

        Screen s=new Screen();

    // Play Vedio
        Pattern play=new Pattern("D:\\WorkSpaces\\SeleniumTasks\\Files\\YT_Play.png");
        s.wait(play,2000);
        s.click();

        Thread.sleep(5000);

    //  Pause Vedio
        Pattern pause=new Pattern("D:\\WorkSpaces\\SeleniumTasks\\Files\\YT_Pause.png");
        s.wait(pause,2000);
        s.click();


    }
}
