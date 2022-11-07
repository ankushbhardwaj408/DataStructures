package com.project;
import com.project.Translator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
public class Design extends JFrame implements ActionListener {
    public static String output="";
    public static String countryName[];
    public static Map<String ,String>
            keyValue=new HashMap<>();
    JLabel warning;
    JTextArea take;
    JTextArea given;
    JButton submit, refresh;
    JComboBox language;
    JPanel w,t,g,s,r,l,last;
    Design() {
//Setting-up frame format
        super("Sentance Translation App");
        String country[] = {"India", "Aus",
                "U.S.A", "England", "Newzealand"};
        setSize(1000, 1000);
        setLayout(new FlowLayout());
        setVisible(true);
//Initailisation of Components
        warning = new JLabel();
        refresh = new JButton("Refresh");
        take = new JTextArea("Please Enter your Sentence here!",30, 30);

        given = new JTextArea(30, 30);
        submit = new JButton("Translate");
        submit.setSize(100,100);
        language = new JComboBox(countryName);
        take.setLineWrap(true);
//Initialisation of Panel
        w=new JPanel();
        t=new JPanel();
        g=new JPanel();
        s=new JPanel();
        r=new JPanel();
        l=new JPanel();
        last=new JPanel();
        //Adding Listeners to components
        submit.addActionListener(this);
        refresh.addActionListener(this);
//Adding components to panels
        w.add(warning);
        r.add(refresh);
        t.add(take);
        l.add(language);
        g.add(given);
        s.add(submit);
//Adding Panels to frame
        add(w);
        add(r);
        add(t);
        add(l);
        add(g);
        add(s);
    }
    public static void initialisedCountries(String lis[],Map<String,String> map) {
    countryName = lis;
        keyValue=map;
    }
    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("Translate")) {

            if (take.getText().length() > 0) {
            String  select=language.getSelectedItem().toString();


            String text = take.getText();
            String to=new String(keyValue.entrySet().stream().filter(entry ->Objects.equals(entry.getValue(),select)).map(Map.Entry::getKey).collect(Collectors.toSet()).toString());








            to=to.substring(1,3);
            try {
                Translator.translate("en",to,text);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
                output=Translator.outFromWeb();
                given.setText(output);
            }
            else {
                warning.setText("Please Enter something to translate!");

            }
        }
        if(e.getActionCommand().equals("Refresh")) {

            warning.setText("");
    }
}
}
class check {
    public static String list[];

    public static void main(String[] args) {
        Map<String, String> code = new LinkedHashMap<>();
        fillCountries(code, list);
        Design obj = new Design();
        obj.setVisible(true);

    }

    private static void fillCountries(Map<String, String> code, String list[]) {


        code.put("af", "Afrikaans");
        code.put("ar", "Arabic");
        code.put("az", "Azerbaijani");
        code.put("be", "Belarusian");
        code.put("bg", "Bulgarian");
        code.put("bn", "Bengali");
        code.put("bs", "Bosnian");
        code.put("ca", "Catalan");
        code.put("ceb", "Cebuano");
        code.put("cs","Czech");
        code.put("cy", "Welsh");
        code.put("da", "Danish");
        code.put("de", "German");
        code.put("el", "Greek");
        code.put("en", "English");
        code.put("eo", "Esperanto");
        code.put("es", "Spanish");
        code.put("et", "Estonian");
        code.put("eu", "Basque");
        code.put("fa", "Persian");
        code.put("fr", "French");
        code.put("ga", "Irish");
        code.put("gu", "Gujarati");
        code.put("ha", "Hausa");
        code.put("hi", "Hindi");
        code.put("id", "Indonesian");
        code.put("ko", "Korean");
        code.put("la", "Latin");
        code.put("lo", "Lao");
        code.put("lt", "Lithuanian");
        code.put("lv", "Latvian");
        code.put("ma", "Punjabi");
        code.put("mg", "Malagasy");
        code.put("mi", "Maori");
        code.put("mk", "Macedonian");
        code.put("ml", "Malayalam");
        code.put("mn", "Mongolian");
        code.put("mr", "Marathi");
        code.put("ms", "Malay");
        code.put("mt", "Maltese");
        code.put("my", "Myanmar (Burmese)");
        code.put("ne", "Nepali");
        code.put("nl", "Dutch");
        code.put("no", "Norwegian");
        code.put("ny", "Chichewa");
        code.put("pl", "Polish");
        code.put("pt", "Portuguese");
        code.put("ro", "Romanian");
        code.put("ru", "Russian");
        code.put("si", "Sinhala");
        code.put("sk", "Slovak");
        code.put("sl", "Slovenian");
        code.put("so", "Somali");
        code.put("sq", "Albanian");
        code.put("sr", "Serbian");
        code.put("st", "Sesotho");
        code.put("su", "Sudanese");
        code.put("sv", "Swedish");
        code.put("sw", "Swahili");
        code.put("ta", "Tamil");
        code.put("te", "Telugu");
        code.put("tg", "Tajik");
        list = new String[code.size()];
        Collection getValues = code.values();
        Iterator i = getValues.iterator();
        int j=0;
        while (i.hasNext()) {
            list[j++]=(String)i.next();
        }
        Design.initialisedCountries(list,code);

    }

    }
