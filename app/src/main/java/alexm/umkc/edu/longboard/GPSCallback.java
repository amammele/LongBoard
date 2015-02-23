package alexm.umkc.edu.longboard;

import android.location.Location;

public interface  GPSCallback{
    public abstract void onGPSUpdate(Location location);
}
