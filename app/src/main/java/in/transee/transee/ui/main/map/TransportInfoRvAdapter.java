package in.transee.transee.ui.main.map;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import in.transee.transee.data.transport.info.TransportInfo;

/**
 * @author Michael Zhukov
 */
public class TransportInfoRvAdapter extends RecyclerView.Adapter<TransportInfoRvAdapter.ViewHolder> {

    private List<TransportInfo> transportInfoList;

    public TransportInfoRvAdapter(List<TransportInfo> transportInfoList) {
        this.transportInfoList = transportInfoList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return transportInfoList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
