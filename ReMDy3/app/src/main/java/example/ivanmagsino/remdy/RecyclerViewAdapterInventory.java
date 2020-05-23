package example.ivanmagsino.remdy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapterInventory extends RecyclerView.Adapter<RecyclerViewAdapterInventory.ViewHolder>{

    private ArrayList<String> mitemid = new ArrayList<>();
    private ArrayList<String> mitemname = new ArrayList<>();
    private ArrayList<String> mitemquantity = new ArrayList<>();
    private ArrayList<String> mitemcategory = new ArrayList<>();
    private ArrayList<String> mitemstatus = new ArrayList<>();

    public RecyclerViewAdapterInventory(ArrayList<String> mitemid, ArrayList<String> mitemname, ArrayList<String> mitemquantity, ArrayList<String> mitemcategory, ArrayList<String> mitemstatus) {
        this.mitemid = mitemid;
        this.mitemname = mitemname;
        this.mitemquantity = mitemquantity;
        this.mitemcategory = mitemcategory;
        this.mitemstatus = mitemstatus;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_listinventory,parent,false);
        ViewHolder holder = new ViewHolder(view);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView itemId,itemName,itemQuantity,itemCategory,itemStatus;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            itemId = itemView.findViewById(R.id.itemid);
            itemName = itemView.findViewById(R.id.itemname);
            itemQuantity = itemView.findViewById(R.id.itemquantity);
            itemCategory = itemView.findViewById(R.id.itemcategory);
            itemStatus = itemView.findViewById(R.id.itemstatus);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
