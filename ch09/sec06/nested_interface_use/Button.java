package ch09.sec06.nested_interface_use;

public class Button {
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;    // field

    public void setClickListener(ClickListener clickListener) {  // method
        this.clickListener = clickListener;
    }
    public void click() {
        this.clickListener.onClick();
    }
}
