package ajaxfire.corporates;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class playerAdapter extends BaseAdapter {

        private Activity activity;
        private ArrayList<HashMap<String, String>> data;
        private static LayoutInflater inflater = null;

        public playerAdapter(Activity a, ArrayList<HashMap<String,String>> d){
            activity = a;
            data = d;
            inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        public int getCount() {
            return data.size();
        }

        public Object getItem(int position){
            return position;
        }
        public long getItemId(int position){
            return position;
        }

        public View getView(int position, View convertView, ViewGroup parent){
            View vi=convertView;
            if(convertView==null){
                vi=inflater.inflate(R.Layout.listview_players, null);
            }
            TextView name = (TextView) vi.findViewById(R.id.txtPlayer);
            HashMap<String,String> role = new HashMap<String,String>();
            role=data.get(position);
            name.setText(role.get(SetupPlayers.playerName));
            return vi;
        }

}
