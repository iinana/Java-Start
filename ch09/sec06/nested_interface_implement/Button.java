package ch09.sec06.nested_interface_implement;

public class Button {
    public static interface ClickListener {
        void onClick();
    }

    private ClickListener clickListener;
    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }
}