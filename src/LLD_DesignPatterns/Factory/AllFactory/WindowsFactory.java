package LLD_DesignPatterns.Factory.AllFactory;

import LLD_DesignPatterns.Factory.Components.Button.Button;
import LLD_DesignPatterns.Factory.Components.Dropdown.Dropdown;
import LLD_DesignPatterns.Factory.Components.Dropdown.WindowsDropdown;
import LLD_DesignPatterns.Factory.Components.Menu.Menu;
import LLD_DesignPatterns.Factory.Components.Menu.WindowsMenu;
import LLD_DesignPatterns.Factory.Components.Button.WindowsButton;

public class WindowsFactory implements UIFactory{

    @Override
    public Menu createMenu(){
        return new WindowsMenu();
    }

    @Override
    public Dropdown createDropdown(){
        return new WindowsDropdown();
    }

    @Override
    public Button createButton(){
        return new WindowsButton();
    }
}
