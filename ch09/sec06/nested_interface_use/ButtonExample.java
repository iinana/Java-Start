package ch09.sec06.nested_interface_use;

public class ButtonExample {
    public static void main (String[] args) {
        Button btnOk = new Button();    // ok button obj

        class OkListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Clicked Ok Button");
            }
        }

        btnOk.setClickListener(new OkListener());
        btnOk.click();
        /* ------------------------------------------------------- */

        Button btnCancel = new Button();    // cancel button obj

        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick() {
                System.out.println("Clicked Cancel Button");
            }
        }

        btnCancel.setClickListener(new CancelListener());
        btnCancel.click();
    }
}
