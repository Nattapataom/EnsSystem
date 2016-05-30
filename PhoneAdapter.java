package com.padrew.enssystem;

        import android.content.Context;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.BaseAdapter;
        import android.widget.TextView;


public class PhoneAdapter extends BaseAdapter{

    //Explicit
    private Context context;
    private String[] callStrings, phoneStrings;

    public PhoneAdapter(Context context, String[] callStrings, String[] phoneStrings) {
        this.context = context;
        this.callStrings = callStrings;
        this.phoneStrings = phoneStrings;
    }   // Constructor

    @Override
    public int getCount() {
        return callStrings.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.phone_listview, viewGroup, false);

        TextView phoneTextView = (TextView) view1.findViewById(R.id.textView25);
        phoneTextView.setText(phoneStrings[i]);

        TextView callTextView = (TextView) view1.findViewById(R.id.textView26);
        callTextView.setText(callStrings[i]);

        return view1;
    }
}   //Main class