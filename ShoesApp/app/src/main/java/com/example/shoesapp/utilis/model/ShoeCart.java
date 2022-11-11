package com.example.shoesapp.utilis.model;
import android.os.Parcel;
import android.os.Parcelable;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "shoe_table")
public class Shoe implements Parcelable {
    @PrimaryKey(autoGenerate = true)
    private int id;
    private String ShoesName,shoesBrand;
    private int shoesImage;
    private double shoesPrice;
    private int quantity;
    private double totalItemPrice;

    public Shoe(String shoesName, String shoesBrand, int shoesImage, double shoesPrice) {
        ShoesName = shoesName;
        this.shoesBrand = shoesBrand;
        this.shoesImage = shoesImage;
        this.shoesPrice = shoesPrice;
    }

    protected Shoe(Parcel in) {
        ShoesName = in.readString();
        shoesBrand = in.readString();
        shoesImage = in.readInt();
        shoesPrice = in.readDouble();
    }

    public static final Creator<Shoe> CREATOR = new Creator<Shoe>() {
        @Override
        public Shoe createFromParcel(Parcel in) {
            return new Shoe(in);
        }

        @Override
        public Shoe[] newArray(int size) {
            return new Shoe[size];
        }
    };

    public String getShoesName() {
        return ShoesName;
    }

    public void setShoesName(String shoesName) {
        ShoesName = shoesName;
    }

    public String getShoesBrand() {
        return shoesBrand;
    }

    public void setShoesBrand(String shoesBrand) {
        this.shoesBrand = shoesBrand;
    }

    public int getShoesImage() {
        return shoesImage;
    }

    public void setShoesImage(int shoesImage) {
        this.shoesImage = shoesImage;
    }

    public double getShoesPrice() {
        return shoesPrice;
    }

    public void setShoesPrice(double shoesPrice) {
        this.shoesPrice = shoesPrice;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ShoesName);
        dest.writeString(shoesBrand);
        dest.writeInt(shoesImage);
        dest.writeDouble(shoesPrice);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalItemPrice() {
        return totalItemPrice;
    }

    public void setTotalItemPrice(double totalItemPrice) {
        this.totalItemPrice = totalItemPrice;
    }
}
