package com.example.a3allmni;

import com.example.a3allmni.model.letter;

public class lettersProvider {

public static letter[] getLetters(){
        return  DATA;
    }


    /*
     * أ، ب، ت، ث، ج، ح، خ، د، ذ، ر، ز، س، ش، ص، ض، ط، ظ، ع، غ، ف، ق، ك، ل، م، ن، هـ، و، ي
     * */

    public static final letter FIRS_LETTER = new letter(0,"أ",R.drawable.a, R.raw.a);  //
    public static final letter SECOND_LETTER = new letter(1,"ب",R.drawable.b, R.raw.b); //
    public static final letter THIRDD_LETTER = new letter(2,"ت",R.drawable.taa,R.raw.taa); //
public static final letter FOURTH_LETTER = new letter(3,"ث",R.drawable.tha,R.raw.tha); //
public static final letter Fi_LETTER = new letter(4,"ج",R.drawable.gem,R.raw.gem); //
public static final letter SITH_LETTER = new letter(5,"ح",R.drawable.h7a,R.raw.h7a); //
public static final letter SEvTH_LETTER = new letter(6,"خ",R.drawable.cha,R.raw.cha); //
public static final letter NINETH_LETTER = new letter(7,"د",R.drawable.dal,R.raw.tha); //
public static final letter TENTH_LETTER = new letter(8,"ذ",R.drawable.thal,R.raw.thal); //
public static final letter ELVTH_LETTER = new letter(9,"ر",R.drawable.raa,R.raw.raa); //
public static final letter TWETH_LETTER = new letter(10,"ز",R.drawable.zen,R.raw.zen); //
public static final letter THRETH_LETTER = new letter(11,"س",R.drawable.sen,R.raw.sen); //
public static final letter FORTE_LETTER = new letter(12,"ش",R.drawable.shen,R.raw.shen); //
public static final letter FIFTE_LETTER = new letter(13,"ص",R.drawable.sad,R.raw.sad); //
public static final letter SIXTE_LETTER = new letter(14,"ض",R.drawable.daad,R.raw.daad); //
public static final letter SEVENT_LETTER = new letter(15,"ط",R.drawable.ttaa,R.raw.ttaa); //


    public static final letter[] DATA={FIRS_LETTER,SECOND_LETTER,THIRDD_LETTER,FOURTH_LETTER,Fi_LETTER,SITH_LETTER,SEvTH_LETTER,NINETH_LETTER,

            TENTH_LETTER,ELVTH_LETTER,TWETH_LETTER,THRETH_LETTER,FORTE_LETTER,FIFTE_LETTER,SIXTE_LETTER,SEVENT_LETTER




    };

}
