package ch09.sec07.nested_interface_improve;

public class ButtonExample {
    public static void main (String[] args) {
        Button btnOk = new Button();    // ok button obj

        btnOk.setClickListener(new Button.ClickListener() {
            @Override
            public void onButton() {
                System.out.println("Click Ok Button");
            } 
        });
        btnOk.click();
        /* ------------------------------------------------------- */

        Button btnCancel = new Button();    // cancel button obj
        
        btnCancel.setClickListener(new Button.ClickListener() {
            @Override
            public void onButton() {
                System.out.println("Click Cancel Button");
            }
        });
        btnCancel.click();
    }
}
