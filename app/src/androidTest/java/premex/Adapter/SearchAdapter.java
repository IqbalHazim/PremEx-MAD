package premex.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.premex.Model.Experts;
import com.example.premex.R;

import java.util.List;

class SearchViewHolder extends RecyclerView.ViewHolder{

    public TextView NameExpert,Position,ActiveStatus,PTj,Department,Unit,Ummail,OtherEmail;
    public SearchViewHolder(View itemView) {
        super(itemView);
        NameExpert = (TextView)itemView.findViewById(R.id.NameExpert);
        Position = (TextView)itemView.findViewById(R.id.Position);
        ActiveStatus = (TextView)itemView.findViewById(R.id.ActiveStatus);
        PTj = (TextView) itemView.findViewById(R.id.PTj);
        Department = (TextView) itemView.findViewById(R.id.Department);
        Unit = (TextView) itemView.findViewById(R.id.Unit);
        Ummail = (TextView) itemView.findViewById(R.id.Ummail);
        OtherEmail = (TextView) itemView.findViewById(R.id.OtherEmail);
    }
}

public class SearchAdapter extends RecyclerView.Adapter<SearchViewHolder>{

    private Context context;
    private List<Experts> experts;

    public SearchAdapter(Context context, List<Experts> experts) {
        this.context = context;
        this.experts = experts;
    }

    @Override
    public SearchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.layout_item,parent,false);
        return new SearchViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(SearchViewHolder holder, int position) {

        holder.NameExpert.setText(experts.get(position).getNameExpert());
        holder.Position.setText(experts.get(position).getPosition());
        holder.ActiveStatus.setText(experts.get(position).getActiveStatus());
        holder.PTj.setText(experts.get(position).getPTj());
        holder.Department.setText(experts.get(position).getDepartment());
        holder.Unit.setText(experts.get(position).getUnit());
        holder.Ummail.setText(experts.get(position).getUmmail());
        holder.OtherEmail.setText(experts.get(position).getOtherEmail());
    }

    @Override
    public int getItemCount() {

        return experts.size();
    }
}
