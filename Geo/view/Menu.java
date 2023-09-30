package Geo.view;

import java.util.ArrayList;

import Geo.Common.Valid;

public abstract class Menu<T> {

        protected String title;
        protected ArrayList<T> options;
        Valid valid = new Valid();
    
        public Menu() {
            options = new ArrayList<>();
        }
    
        public Menu(String td, String[] mc) {
            title = td;
            options = new ArrayList<>();
            for (String s : mc) {
                options.add((T) s);
            }
        }
    
        //-------------------------------------------
        public void display() {
            System.out.println(title);
            System.out.println("--------------------------------");
            for (int i = 0; i < options.size(); i++) {
                System.out.println((i + 1) + "." + options.get(i));
            }
            System.out.println("--------------------------------");
        }
    //-------------------------------------------
    
        public int getSelected() {
            display();
            return valid.getInt("Enter your choice", 1, options.size() + 1);
        }
    //-------------------------------------------
    
        public abstract void execute(int n);
    //-------------------------------------------
    
        public void run() {
            while (true) {
                int n = getSelected();
                execute(n);
                if (n > options.size()) {
                    break;
                }
            }
        }
}
