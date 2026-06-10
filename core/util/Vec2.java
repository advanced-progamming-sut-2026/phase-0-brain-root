package core.util;

public class Vec2
{
    public double x;
    public double y;

    public Vec2(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public void add(Vec2 other)
    {
        this.x += other.x;
        this.y += other.y;
    }
}
