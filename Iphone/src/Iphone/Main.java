package Iphone;

import Iphone.Browser.Browser;
import Iphone.Phone.Phone;
import Iphone.SongPlayer.SongPlayer;

public class Main {
    public static void main(String[] args) {
        SongPlayer songPlayer = new SongPlayer();

        songPlayer.play("song 1");
        songPlayer.pause("song 1");
        songPlayer.selectSong("song 2");

        Phone phone = new Phone();

        phone.call("contact 1");
        phone.answer("Lucas");
        phone.startVoiceMail("contact 2");

        Browser browser = new Browser();

        browser.showPage("https://www.google.com");
        browser.addNewWindow();
        browser.refresh();
    }
}