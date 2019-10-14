package id.ac.polinema.fashionshop.Activities;


import android.os.Parcel;
import android.os.Parcelable;


public class ShopFashion implements Parcelable {
    public static final int HIJAB = 0;
    public static final int DRESS = 1;
    public static final int CELANA = 2;

    private String nama;
    private int type;
    private int satuan;
    private int jumlah;

    public String getNama() {
        return nama;
    }

    public int getType() {
        return type;
    }

    public int getSatuan() {
        return satuan;
    }

    public ShopFashion(String nama, int type, int satuan) {
        this.nama = nama;
        this.type = type;
        this.satuan = satuan;
    }

    protected ShopFashion(Parcel in) {
        nama = in.readString();
        type = in.readInt();
        satuan = in.readInt();
    }

    public static final Creator<ShopFashion> CREATOR = new Creator<ShopFashion>() {
        @Override
        public ShopFashion createFromParcel(Parcel in) {
            return new ShopFashion(in);
        }

        @Override
        public ShopFashion[] newArray(int size) {
            return new ShopFashion[size];
        }
    };

    public int getJumlah() {
        return jumlah;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nama);
        parcel.writeInt(type);
        parcel.writeInt(satuan);
        parcel.writeInt(jumlah);
    }
}
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_shop_fashion);
//    }
