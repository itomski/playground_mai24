package de.lubowiecki.playground.uebungen.produkte;

import java.time.LocalDate;

public class VerdeblichesProdukt extends Produkt {

    private LocalDate mhd;

    public LocalDate getMhd() {
        return mhd;
    }

    public void setMhd(LocalDate mhd) {
        this.mhd = mhd;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("VerdeblichesProdukt{");
        sb.append("produkt=").append(super.toString());
        sb.append(", mhd=").append(mhd);
        sb.append('}');
        return sb.toString();
    }
}
