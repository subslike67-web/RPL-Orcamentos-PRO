package br.com.rpl.orcamentos;
import android.os.Bundle;import com.getcapacitor.BridgeActivity;
public class MainActivity extends BridgeActivity { @Override public void onCreate(Bundle savedInstanceState){registerPlugin(RplFiles.class);super.onCreate(savedInstanceState);} }
