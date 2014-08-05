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

public class PantallaPrimeraActivity extends ActionBarActivity {

	Button mAceptar;
	Button mInvitado;
	Button mNuevoUsuario;
	EditText mUsuario;
	EditText mContrasena;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.pantallaprimera);

		iniciar();
		if (savedInstanceState == null) {
		}
	}

	public void iniciar() {

		this.mAceptar= (Button)findViewById(R.id.aceptarPI);
		this.mInvitado= (Button)findViewById(R.id.invitadoPI);
		this.mNuevoUsuario= (Button)findViewById(R.id.nuevoUsuarioPI);
		this.mContrasena= (EditText)findViewById(R.id.contrasenaPI);
		this.mUsuario= (EditText)findViewById(R.id.usuarioPI);
		
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
	public void aceptarPulsado(View view){
		Intent i= new Intent (this.getApplicationContext(),PantallaMenuActivity.class);
		startActivity(i);
		finish();
	}
	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}


	}
}