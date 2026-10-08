package LLD_DesignPatterns.Factory.AllFactory;

import LLD_DesignPatterns.Factory.Components.Button.Button;
import LLD_DesignPatterns.Factory.Components.Dropdown.Dropdown;
import LLD_DesignPatterns.Factory.Components.Menu.Menu;

public interface UIFactory {
    Menu createMenu();
    Dropdown createDropdown();
    Button createButton();
}
