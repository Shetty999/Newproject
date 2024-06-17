package inhertence;

public abstract class abstraction {
    int i;
    float f;
    public abstraction(int i, float f)
    {
        this.i=i;
        this.f=f;
    }
    public void display()
    {
        System.out.println(this.i);
        System.out.println(this.f);
    }
    public abstract void display1();
}
