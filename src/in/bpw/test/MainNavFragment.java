package in.bpw.test;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class MainNavFragment extends Fragment {
	
	
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
	
		// Retrieving the currently selected item number
		int position = getArguments().getInt("position");
		
		// List of Items
		String[] rivers = getResources().getStringArray(R.array.navlist);
		
		// Creating view correspoding to the fragment
	//	View v = inflater.inflate(R.layout.fragment_layout, container, false);
		// Getting reference to the TextView of the Fragment
			/*	TextView tv = (TextView) v.findViewById(R.id.tv_content);
				
				// Setting currently selected river name in the TextView
				tv.setText(rivers[position]);	*/	
				
				// Updating the action bar title
			//	getActivity().getActionBar().setTitle(rivers[position]);
		
				switch(position)
						{
				
				case 1: 
					View home = inflater.inflate(R.layout.home_main, container, false);
					return home;
				default:
					View v = inflater.inflate(R.layout.fragment_layout, container, false);
					return v;
					 
				
			}
	}
}
