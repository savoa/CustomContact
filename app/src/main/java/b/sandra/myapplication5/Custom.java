package b.sandra.myapplication5;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * Created by student on 27.3.2018.
 */




    public class Custom{

        public String ime;
        public Drawable slika;

        public Custom(String ime, Drawable slika) {
            this.ime = ime;
            this.slika = slika;
        }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Drawable getSlika() {
        return slika;
    }

    public void setSlika(Drawable slika) {
        this.slika = slika;
    }
}







