import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class MainPage {

    public static String signUp = "//*[@id=\"header\"]/div[2]/div/div[5]/ul/li/button";
    public static String register = "/html/body/app/div/div[1]/headerpart/nav/div[2]/div/div[5]/ul/li/button/div/ol/li[2]/div[2]/strong";
    public static String chooseSignup = "//*[@id=\"loginScreen\"]/div/div[2]/div[3]/div/div/form/ul[1]/li[2]/p[2]/button";
    public static String emailField = "//*[@id=\"loginScreen\"]/div/div[2]/div[3]/div/div/form/ul[1]/li[1]/div[2]/input";
    public static String nameField = "//*[@id=\"loginScreen\"]/div/div[2]/div[4]/div/div/form/ul[2]/li[2]/input";
    public static String numberField = "//*[@id=\"loginScreen\"]/div/div[2]/div[4]/div/div/form/ul[2]/li[3]/international-phone-number/div/input";
    public static String tour = "/html/body/app/div/div[1]/div/main/app-welcome/div/div[1]/div[2]/button";
    public static String skip = "/html/body/app/div/div[1]/div/main/app-welcome/div/div[2]/div[1]/div[2]/div[2]/button";
    public static String userPanel = "//*[@id=\"header\"]/div[2]/div/div[5]";
    public static String done = "//*[@id=\"header\"]/div[1]/div[1]/button";
    public static String next = "//*[@id=\"loginScreen\"]/div/div[2]/div[3]/div/div/form/ul[1]/li[2]/button";
    public static String passwordField = "#loginScreen > div > div.popHolder.loginRegister > div.loginRegisterRight > div > div > form > ul.singupSteps.activeStep > li:nth-child(4) > div > input";
    public static String submit = "//*[@id=\"loginScreen\"]/div/div[2]/div[4]/div/div/form/ul[2]/li[6]/button";
    public static String currency = "//*[@id=\"header\"]/div[2]/div/div[6]";
    public static String dollar = "//*[@id=\"header\"]/div[2]/div/div[6]/div/div/div[1]/span";
}
