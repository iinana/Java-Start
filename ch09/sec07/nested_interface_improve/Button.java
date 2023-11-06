package ch09.sec07.nested_interface_improve;

public class Button {
    public interface ClickListener {
        void onButton();
    }    

    ClickListener cl;
    public void setClickListener(ClickListener cl) {
        this.cl = cl;
    }

    public void click() {
        cl.onButton();
    }
}
