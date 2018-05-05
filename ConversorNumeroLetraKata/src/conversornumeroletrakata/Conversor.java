/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversornumeroletrakata;

/**
 *
 * @author Daniel Santos
 */
public class Conversor {

    private String uni;
    private String dec;
    private String cen;
    private String mil;
    private String millon;

    public String getUnidad(int numero) {
        if (numero != 15 && numero != 14 && numero != 13 && numero != 12 && numero != 11) {
            switch ((int) numero % 10) {
                case 1:
                    uni = " uno ";
                    break;
                case 2:
                    uni = " dos ";
                    break;
                case 3:
                    uni = " tres ";
                    break;
                case 4:
                    uni = " cuatro ";
                    break;
                case 5:
                    uni = " cinco ";
                    break;
                case 6:
                    uni = " seis ";
                    break;
                case 7:
                    uni = " siete ";
                    break;
                case 8:
                    uni = " ocho ";
                    break;
                case 9:
                    uni = " nueve ";
                    break;

            }
        }

        if (uni == null) {
            uni = " ";
        }
        return uni;
    }

    public String getDecenas(int numero) {
        if (numero != 11 && numero != 12 && numero != 13 && numero != 14 && numero != 15) {
            switch (numero - (numero % 10)) {
                case 10:
                    dec = " diez ";
                    break;
                case 20:
                    dec = " veinte ";
                    break;
                case 30:
                    dec = " treinta ";
                    break;
                case 40:
                    dec = " cuarenta ";
                    break;
                case 50:
                    dec = " cincuenta ";
                    break;
                case 60:
                    dec = " sedenta ";
                    break;
                case 70:
                    dec = " setenta ";
                    break;
                case 80:
                    dec = " ochenta ";
                    break;
                case 90:
                    dec = " noventa ";
                    break;

            }
        }
        switch (numero) {

            case 11:
                dec = " once ";
                break;
            case 12:
                dec = " doce ";
                break;
            case 13:
                dec = " trece ";
                break;
            case 14:
                dec = " catorce ";
                break;
            case 15:
                dec = " quince ";
                break;

        }

        if (dec == null) {
            dec = " ";
        }
        if (numero % 10 != 0 && numero > 15) {
            dec = dec + " y ";
        }
        if (numero > 20 && numero < 30) {
            dec = " veinti y ";
        }
        return dec;

    }

    public String getCientos(int numero) {
        switch (numero - (numero % 100)) {

            case 200:
                cen = " doscientos ";
                break;
            case 300:
                cen = " trescientos ";
                break;
            case 400:
                cen = " cuatrocientos ";
                break;
            case 500:
                cen = " quinientos ";
                break;
            case 600:
                cen = " seiscientos ";
                break;
            case 700:
                cen = " setecientos ";
                break;
            case 800:
                cen = " ochocientos ";
                break;
            case 900:
                cen = " novecientos ";
                break;
        }
        if (numero == 100) {

            cen = " cien ";

        } else {
            if (numero > 100 && numero < 200) {
                cen = " ciento ";
            }
        }
        if (cen == null) {
            cen = " ";
        }

        return cen;
    }

    public String getMiles(int numero) {
        switch (numero) {

            case 1:
                mil = " mil ";
                break;
            case 101:
                mil = " ciento un mil ";
                break;
        }
        if (numero != 1 && numero != 101) {
            mil = getCientos((int) numero) + getDecenas((int) numero % 100) + getUnidad((int) numero % 10) + "mil ";
        }
        if (mil == null) {
            mil = " ";
        }
        return mil;
    }

    public String getMillones(int numero) {
        switch (numero) {

            case 1:
                millon = " un millon ";
                break;
            case 101:
                millon = " ciento un millones ";
                break;
        }
        if (numero != 1 && numero != 101) {
            millon = getCientos((int) numero) + getDecenas((int) numero % 100) + getUnidad((int) numero % 10) + " millones ";
        }
        if (millon == null) {
            millon = " ";
        }
        return millon;
    }

}
