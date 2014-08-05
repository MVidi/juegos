package com.example.juego;


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



public class pantallaMenuActivity  extends ActionBarActivity {
	
	Button mJugar;
	Button mTipoPartida;
	Button mAmigos;
	Button mConfigurar;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.paginamenu);
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
		
		this.mConfigurar= (Button)findViewById(R.id.configurarPM);
		this.mJugar= (Button)findViewById(R.id.jugarPM);
		this.mAmigos= (Button)findViewById(R.id.amigosPM);
		this.mTipoPartida= (Button)findViewById(R.id.tipopartidaPM);
		
		
	}


	public void empezarJuego(View view){
		
		Intent i= new Intent (this,pantallaJuegoActivity.class);
		startActivity(i);
	}
	
}

	


