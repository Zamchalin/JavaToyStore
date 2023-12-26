import Controller.Controller;
import Interface.IContainer;
import Interface.ICustomToy;
import Model.Container;
import Model.CustomToy;
import Model.Toy;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.getView(10);

    }
}