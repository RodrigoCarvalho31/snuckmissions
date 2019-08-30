package net.snuckdev.snuckmissions.licenceserver;

import net.snuckdev.snuckmissions.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.ConsoleCommandSender;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Response {

    public static void verifyLicence(ConsoleCommandSender ccs, String licence, Main plugin) {

        try {


            //O nome "oracle" é que eu peguei o código do site do Java..

            URL oracle = new URL("http://https://snucklicences.000webhostapp.com/check.php?licenca=" + licence + "&plugin=1");
            URLConnection yc = oracle.openConnection();
            yc.setConnectTimeout(5000);
            yc.setReadTimeout(5000);
            BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream()));
            if (in.readLine().equals("true")) {
                ccs.sendMessage("§e[SnuckMissions] §aSua licença é válida! Plugin ativado com sucesso!");
            } else {
                ccs.sendMessage("§4Sua licença não é válida!");
                ccs.sendMessage("§4Verifique a chave de licenciamento e tente novamente.");
                ccs.sendMessage("§4O plugin será desabilitado por questões de segurança.");
                Bukkit.getPluginManager().disablePlugin(plugin);
            }


        } catch (Exception e) {
            ccs.sendMessage("§4Não foi possível verificar sua licença. O plugin foi desativado por medidas preventivas.");
            Bukkit.getPluginManager().disablePlugin(plugin);
        }

    }

}
