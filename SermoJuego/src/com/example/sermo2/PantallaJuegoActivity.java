package com.example.sermo2;


import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Build;

public class PantallaJuegoActivity extends ActionBarActivity {
	
	Button mRespuesta1;
	Button mRespuesta2;
	Button mRespuesta3;
	Button mRespuesta4;
	Button mRespuesta5;
	Button mRespuesta6;
	Button mRespuesta7;
	Button mRespuesta8;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pantallajuego);
		iniciar();
		if (savedInstanceState == null) {
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.conexion, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	public void iniciar (){
		
		this.mRespuesta1= (Button)findViewById(R.id.respuesta1PJ);
		this.mRespuesta2= (Button)findViewById(R.id.respuesta2PJ);
		this.mRespuesta3= (Button)findViewById(R.id.respuesta3PJ);
		this.mRespuesta4= (Button)findViewById(R.id.respuesta4PJ);
		this.mRespuesta5= (Button)findViewById(R.id.respuesta5PJ);
		this.mRespuesta6= (Button)findViewById(R.id.respuesta6PJ);
		this.mRespuesta7= (Button)findViewById(R.id.respuesta7PJ);
		this.mRespuesta8= (Button)findViewById(R.id.respuesta8PJ);
		
		
	}

	
}