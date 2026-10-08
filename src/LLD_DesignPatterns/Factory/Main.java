package LLD_DesignPatterns.Factory;

import LLD_DesignPatterns.Factory.AllFactory.UIFactory;
import LLD_DesignPatterns.Factory.Components.Button.Button;
import LLD_DesignPatterns.Factory.Components.Dropdown.Dropdown;
import LLD_DesignPatterns.Factory.Components.Menu.Menu;
import LLD_DesignPatterns.Factory.Flutter.Flutter;
import LLD_DesignPatterns.Factory.Flutter.SupportPlatforms;

public class Main {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportPlatforms.IOS);
        UIFactory uiFactory = flutter.uiFactory();
        Menu menu = uiFactory.createMenu();
        Dropdown dropdown = uiFactory.createDropdown();
        Button button = uiFactory.createButton();

    }
}
