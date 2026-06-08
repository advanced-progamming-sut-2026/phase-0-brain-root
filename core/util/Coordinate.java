package core.util;

public class Coordinate<T extends Number>
{
    private T x;
    private T y;

    public Coordinate(T x, T y)
    {
        this.x = x;
        this.y = y;
    }

    public T getX()
    {
        return x;
    }

    public void setX(T x)
    {
        this.x = x;
    }

    public T getY()
    {
        return y;
    }

    public void setY(T y)
    {
        this.y = y;
    }
}
