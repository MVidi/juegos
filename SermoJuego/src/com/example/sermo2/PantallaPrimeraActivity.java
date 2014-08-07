package com.example.sermo2;

import java.net.UnknownHostException;
import java.util.List;
import java.util.Set;

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
import android.widget.Toast;
import android.os.Build;

import com.mongodb.DB;
import com.mongodb.MongoClient;

public class PantallaPrimeraActivity extends ActionBarActivity {
// borrar esta linea si esta al subirse a git
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
	
	
	public void clicarContrasena(View view){      
	      if(view.getId()==R.id.contrasenaPI);
	           mContrasena.setText("");    
	}
	
	public void clicarUsuario(View view){      
	      if(view.getId()==R.id.usuarioPI);
	           mUsuario.setText("");    
	}
	/* conectar a mongo
	 * 
	 * 
	public void conectarMongo(View view){
		String S;
		MongoClient mongo = null;
        try {
            mongo = new MongoClient("ds061199.mongolab.com", 61199);
            
           
           
           
           
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
     
 
        if (mongo != null) {
           S= "encontrado";
          
        } else {
            S="no encontrado";
        }
		Toast.makeText(view.getContext(), S, Toast.LENGTH_SHORT).show();
		
		DB db = mongo.getDB("sermo");
        boolean auth = db.authenticate("mvidi", "quejigal".toCharArray());
         
        Set<String> colecciones = db.getCollectionNames();
        Toast.makeText(view.getContext(), Integer.toString(colecciones.size()), Toast.LENGTH_SHORT).show();
		
	}*/
	/**
	 * A placeholder fragment containing a simple view.
	 */
	public static class PlaceholderFragment extends Fragment {

		public PlaceholderFragment() {
		}


	}
}
