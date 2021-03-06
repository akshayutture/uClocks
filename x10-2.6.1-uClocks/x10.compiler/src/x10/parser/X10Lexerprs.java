/*
 *  This file is part of the X10 project (http://x10-lang.org).
 *
 *  This file is licensed to You under the Eclipse Public License (EPL);
 *  You may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *      http://www.opensource.org/licenses/eclipse-1.0.php
 *
 *  (C) Copyright IBM Corporation 2006-2016.
 */
/**************************************************************************
 * WARNING!  THIS JAVA FILE IS AUTO-GENERATED FROM x10/parser/X10Lexer.gi *
 **************************************************************************/

package x10.parser;

public class X10Lexerprs implements lpg.runtime.ParseTable, X10Lexersym {
    public final static int ERROR_SYMBOL = 0;
    public final int getErrorSymbol() { return ERROR_SYMBOL; }

    public final static int SCOPE_UBOUND = 0;
    public final int getScopeUbound() { return SCOPE_UBOUND; }

    public final static int SCOPE_SIZE = 0;
    public final int getScopeSize() { return SCOPE_SIZE; }

    public final static int MAX_NAME_LENGTH = 0;
    public final int getMaxNameLength() { return MAX_NAME_LENGTH; }

    public final static int NUM_STATES = 91;
    public final int getNumStates() { return NUM_STATES; }

    public final static int NT_OFFSET = 102;
    public final int getNtOffset() { return NT_OFFSET; }

    public final static int LA_STATE_OFFSET = 1168;
    public final int getLaStateOffset() { return LA_STATE_OFFSET; }

    public final static int MAX_LA = 2;
    public final int getMaxLa() { return MAX_LA; }

    public final static int NUM_RULES = 452;
    public final int getNumRules() { return NUM_RULES; }

    public final static int NUM_NONTERMINALS = 58;
    public final int getNumNonterminals() { return NUM_NONTERMINALS; }

    public final static int NUM_SYMBOLS = 160;
    public final int getNumSymbols() { return NUM_SYMBOLS; }

    public final static int SEGMENT_SIZE = 8192;
    public final int getSegmentSize() { return SEGMENT_SIZE; }

    public final static int START_STATE = 453;
    public final int getStartState() { return START_STATE; }

    public final static int IDENTIFIER_SYMBOL = 0;
    public final int getIdentifier_SYMBOL() { return IDENTIFIER_SYMBOL; }

    public final static int EOFT_SYMBOL = 99;
    public final int getEoftSymbol() { return EOFT_SYMBOL; }

    public final static int EOLT_SYMBOL = 103;
    public final int getEoltSymbol() { return EOLT_SYMBOL; }

    public final static int ACCEPT_ACTION = 715;
    public final int getAcceptAction() { return ACCEPT_ACTION; }

    public final static int ERROR_ACTION = 716;
    public final int getErrorAction() { return ERROR_ACTION; }

    public final static boolean BACKTRACK = false;
    public final boolean getBacktrack() { return BACKTRACK; }

    public final int getStartSymbol() { return lhs(0); }
    public final boolean isValidForParser() { return X10Lexersym.isValidForParser; }


    public interface IsNullable {
        public final static byte isNullable[] = {0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,1,1,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,1,0,0,
            0,0,0,0,0,0,0,0,0,0
        };
    };
    public final static byte isNullable[] = IsNullable.isNullable;
    public final boolean isNullable(int index) { return isNullable[index] != 0; }

    public interface ProsthesesIndex {
        public final static byte prosthesesIndex[] = {0,
            42,43,49,45,46,47,22,29,48,31,
            33,44,57,25,26,27,28,32,34,37,
            50,52,2,3,4,5,6,7,8,9,
            10,11,12,13,14,15,16,17,18,19,
            20,21,23,24,30,35,36,38,39,40,
            41,51,53,54,55,58,1,56
        };
    };
    public final static byte prosthesesIndex[] = ProsthesesIndex.prosthesesIndex;
    public final int prosthesesIndex(int index) { return prosthesesIndex[index]; }

    public interface IsKeyword {
        public final static byte isKeyword[] = {0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0
        };
    };
    public final static byte isKeyword[] = IsKeyword.isKeyword;
    public final boolean isKeyword(int index) { return isKeyword[index] != 0; }

    public interface BaseCheck {
        public final static byte baseCheck[] = {0,
            1,3,3,3,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,2,2,2,2,2,2,2,
            2,3,2,2,2,2,2,2,2,2,
            3,3,4,2,2,3,1,3,2,1,
            2,2,2,3,3,3,3,2,3,3,
            3,3,2,3,3,2,1,2,2,2,
            3,3,2,2,5,3,2,2,0,1,
            2,1,2,2,0,2,0,2,1,2,
            1,2,2,2,3,2,3,3,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,2,3,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,2,1,2,2,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            1,1,1,1,1,1,1,1,1,1,
            6,2,1,1,1,1,1,1,1,6,
            2,1,1,1,1,1,1,1,6,2,
            2,2,2,2,2,2,2,2,2,1,
            2,2,2,2,2,2,2,2,2,2,
            2,2,3,3,3,2,3,3,3,3,
            3,3
        };
    };
    public final static byte baseCheck[] = BaseCheck.baseCheck;
    public final int baseCheck(int index) { return baseCheck[index]; }
    public final static byte rhs[] = baseCheck;
    public final int rhs(int index) { return rhs[index]; };

    public interface BaseAction {
        public final static char baseAction[] = {
            23,23,23,23,23,23,23,23,23,23,
            23,23,23,23,23,23,23,23,23,23,
            23,23,23,23,23,23,23,23,23,23,
            23,23,23,23,23,23,23,23,23,23,
            23,23,23,23,23,23,23,23,23,23,
            23,23,23,23,23,23,23,23,23,23,
            23,23,23,23,23,23,23,42,42,28,
            29,29,30,31,32,32,33,33,33,34,
            34,35,35,36,36,36,36,37,37,37,
            37,37,37,37,38,39,46,46,46,46,
            47,47,40,48,48,25,25,26,26,7,
            7,44,44,45,45,45,18,18,18,12,
            12,12,12,12,4,4,4,4,4,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,5,5,5,5,5,
            5,5,5,5,5,6,6,6,6,6,
            6,6,6,6,6,6,6,6,6,6,
            6,6,6,6,6,6,6,6,6,6,
            6,1,1,1,1,1,1,1,1,1,
            1,9,9,9,9,9,9,9,9,3,
            3,3,3,3,3,3,3,3,3,3,
            3,2,2,21,21,21,10,10,11,11,
            14,14,15,15,16,16,17,17,8,8,
            19,19,43,43,41,41,24,24,24,52,
            52,52,52,52,52,52,52,52,52,52,
            52,52,52,52,52,52,52,52,52,52,
            52,52,52,52,52,52,52,52,22,22,
            22,22,22,22,22,22,22,22,22,22,
            22,22,22,22,22,22,22,22,22,22,
            22,22,22,22,22,22,53,53,53,53,
            53,53,53,53,53,53,53,53,53,53,
            53,53,53,53,53,53,53,53,53,53,
            53,53,53,53,54,54,54,54,54,54,
            54,54,54,54,54,54,54,54,54,54,
            54,54,54,54,54,54,54,54,54,54,
            54,54,55,55,55,55,55,55,55,55,
            55,55,55,55,55,55,55,55,55,55,
            55,55,55,55,55,55,55,55,55,55,
            20,20,20,20,58,58,49,49,49,49,
            49,49,49,49,51,51,51,51,51,51,
            51,51,51,27,27,27,27,27,27,27,
            27,27,50,50,50,50,50,50,50,50,
            50,13,13,13,13,13,13,13,13,13,
            23,23,23,23,23,23,23,23,23,23,
            23,23,23,23,23,23,23,23,23,23,
            23,23,56,308,704,1088,1213,703,703,703,
            461,1125,110,1283,629,705,83,90,1154,304,
            629,86,93,1542,496,560,455,579,1540,540,
            659,5,6,7,8,9,10,11,12,13,
            14,15,16,17,502,554,734,742,456,1,
            98,552,1541,98,98,98,84,91,100,430,
            1218,98,608,700,235,499,700,700,700,98,
            1144,98,410,108,745,700,108,108,108,675,
            1155,1215,509,106,522,108,106,106,106,700,
            1298,411,1294,103,96,106,543,96,96,96,
            85,92,205,104,1320,96,104,104,104,1161,
            1261,677,578,96,1193,96,700,677,672,671,
            665,564,82,108,588,108,1545,202,1442,707,
            238,1308,106,237,237,237,1543,106,789,605,
            605,605,74,76,79,81,813,609,609,609,
            1549,104,532,1544,104,837,112,112,112,861,
            621,621,621,885,625,625,625,909,633,633,
            633,933,637,637,637,957,641,641,641,1361,
            110,1295,605,981,645,645,645,1005,410,410,
            410,1029,649,649,649,1053,653,653,653,1077,
            401,401,401,1101,419,419,419,1322,686,1272,
            677,1196,1372,688,686,1550,677,1383,691,688,
            675,1562,1571,80,691,1250,1170,1394,110,77,
            75,1443,420,1336,681,402,1409,110,1420,110,
            215,1431,110,1546,1547,1548,1552,1568,1583,1587,
            1316,1153,1593,1462,1309,1465,1452,1477,1486,1495,
            1504,1513,1522,1531,716,716
        };
    };
    public final static char baseAction[] = BaseAction.baseAction;
    public final int baseAction(int index) { return baseAction[index]; }
    public final static char lhs[] = baseAction;
    public final int lhs(int index) { return lhs[index]; };

    public interface TermCheck {
        public final static byte termCheck[] = {0,
            0,1,2,3,4,5,6,7,8,9,
            10,11,12,13,14,15,16,17,18,19,
            20,21,22,23,24,25,26,27,28,29,
            30,31,32,33,34,35,36,37,38,39,
            40,41,42,43,44,45,46,47,48,49,
            50,51,52,53,54,55,56,57,58,59,
            60,61,62,63,64,65,66,67,68,69,
            70,71,72,73,74,75,76,77,78,79,
            80,81,82,83,84,85,86,87,88,89,
            90,91,92,93,94,95,96,97,98,0,
            100,101,0,1,2,3,4,5,6,7,
            8,9,10,11,12,13,14,15,16,17,
            18,19,20,21,22,23,24,25,26,27,
            28,29,30,31,32,33,34,35,36,37,
            38,39,40,41,42,43,44,45,46,47,
            48,49,50,51,52,53,54,55,56,57,
            58,59,60,61,62,63,64,65,66,67,
            68,69,70,71,72,73,74,75,76,77,
            78,79,80,81,82,83,84,85,86,87,
            88,89,90,91,92,93,94,95,96,97,
            98,0,100,101,0,1,2,3,4,5,
            6,7,8,9,10,11,12,13,14,15,
            16,17,18,19,20,21,22,23,24,25,
            26,27,28,29,30,31,32,33,34,35,
            36,37,38,39,40,41,42,43,44,45,
            46,47,48,49,50,51,52,53,54,55,
            56,57,58,59,60,61,62,63,64,65,
            66,67,68,69,70,71,72,73,74,75,
            76,77,78,79,80,81,82,83,84,85,
            86,87,88,89,90,91,92,93,94,95,
            96,97,98,0,0,0,102,0,1,2,
            3,4,5,6,7,8,9,10,11,12,
            13,14,15,16,17,18,19,20,21,22,
            23,24,25,26,27,28,29,30,31,32,
            33,34,35,36,37,38,39,40,41,42,
            43,44,45,0,47,48,49,50,51,52,
            53,54,55,56,57,58,59,60,61,62,
            63,64,65,66,67,68,69,70,71,72,
            73,74,75,76,77,78,79,80,81,82,
            83,84,85,86,87,88,89,90,91,92,
            93,94,95,96,97,0,0,100,101,0,
            1,2,3,4,5,6,7,8,9,10,
            11,12,13,14,15,16,17,18,19,20,
            21,22,23,24,25,26,27,28,29,30,
            31,32,33,34,35,36,37,38,39,40,
            41,42,43,44,45,46,47,48,49,50,
            51,52,53,54,55,56,57,58,59,60,
            61,62,63,64,65,66,67,68,69,70,
            71,72,73,74,75,76,77,78,79,80,
            81,82,83,84,85,86,87,88,89,90,
            91,92,93,94,95,96,97,98,0,1,
            2,3,4,5,6,7,8,9,10,11,
            12,13,14,15,16,17,18,19,20,21,
            22,23,24,25,26,27,28,29,30,31,
            32,33,34,35,36,37,38,39,40,41,
            42,43,44,45,46,47,48,49,50,51,
            52,53,54,55,56,57,58,59,60,61,
            62,63,64,65,66,67,68,69,70,71,
            72,73,74,75,76,77,78,79,80,81,
            82,83,84,85,86,87,88,89,90,91,
            92,93,94,95,96,97,98,0,1,2,
            3,4,5,6,7,8,9,10,11,12,
            13,14,15,16,17,18,19,20,21,22,
            23,24,25,26,27,28,29,30,31,32,
            33,34,35,36,37,38,39,0,41,42,
            43,44,45,46,47,48,49,50,51,52,
            53,54,55,56,57,58,59,60,61,62,
            63,64,65,66,67,68,69,70,71,72,
            73,74,75,76,77,78,79,80,81,82,
            83,84,85,86,87,88,89,90,91,92,
            93,94,95,96,97,98,0,1,2,3,
            4,5,6,7,8,9,10,0,12,13,
            14,15,16,17,18,19,20,21,22,23,
            24,25,26,0,28,29,30,31,32,33,
            34,0,36,37,0,12,13,14,15,0,
            44,45,11,0,0,11,50,51,52,53,
            54,55,56,57,58,59,60,61,62,63,
            64,65,66,67,68,69,70,71,72,73,
            74,75,76,77,0,0,0,81,0,1,
            2,3,4,5,6,7,8,9,10,0,
            12,13,14,15,16,17,18,19,20,21,
            22,23,0,1,2,3,4,5,6,7,
            8,9,10,82,12,13,14,15,16,17,
            18,19,20,21,22,23,0,1,2,3,
            4,5,6,7,8,9,10,0,12,13,
            14,15,16,17,18,19,20,21,22,23,
            0,1,2,3,4,5,6,7,8,9,
            10,0,12,13,14,15,16,17,18,19,
            20,21,22,23,0,1,2,3,4,5,
            6,7,8,9,10,0,12,13,14,15,
            16,17,18,19,20,21,22,23,0,1,
            2,3,4,5,6,7,8,9,10,0,
            12,13,14,15,16,17,18,19,20,21,
            22,23,0,1,2,3,4,5,6,7,
            8,9,10,0,12,13,14,15,16,17,
            18,19,20,21,22,23,0,1,2,3,
            4,5,6,7,8,9,10,0,12,13,
            14,15,16,17,18,19,20,21,22,23,
            0,1,2,3,4,5,6,7,8,9,
            10,0,12,13,14,15,16,17,18,19,
            20,21,22,23,0,1,2,3,4,5,
            6,7,8,9,10,0,12,13,14,15,
            16,17,18,19,20,21,22,23,0,1,
            2,3,4,5,6,7,8,9,10,0,
            12,13,14,15,16,17,18,19,20,21,
            22,23,0,1,2,3,4,5,6,7,
            8,9,10,0,12,13,14,15,16,17,
            18,19,20,21,22,23,0,1,2,3,
            4,5,6,7,8,9,10,0,12,13,
            14,15,16,17,18,19,20,21,22,23,
            0,1,2,3,4,5,6,7,8,9,
            10,0,12,13,14,15,16,17,18,19,
            20,21,22,23,0,1,2,3,4,5,
            6,7,8,9,10,0,12,13,14,15,
            0,17,18,0,1,2,3,4,5,6,
            7,8,0,0,0,12,0,0,0,16,
            0,0,38,11,11,11,0,24,25,0,
            1,2,3,4,5,6,7,8,0,36,
            37,12,39,40,41,16,99,27,0,46,
            38,0,0,24,25,0,1,2,3,4,
            5,6,7,8,0,36,37,12,39,40,
            41,16,0,0,0,46,24,0,26,24,
            25,0,0,99,12,13,14,15,11,17,
            18,36,37,80,39,40,41,0,24,25,
            26,46,28,29,30,31,32,33,34,0,
            1,2,3,4,5,6,7,8,44,45,
            0,1,2,3,4,5,6,7,8,9,
            10,0,1,2,3,4,5,6,7,8,
            9,10,0,1,2,3,4,5,6,7,
            8,9,10,0,0,35,79,0,0,0,
            0,0,0,43,11,11,35,0,0,12,
            13,14,15,99,43,0,0,0,11,0,
            38,0,1,2,3,4,5,6,7,8,
            9,10,24,25,26,0,28,29,30,31,
            32,33,34,24,25,26,11,28,29,30,
            31,32,33,34,47,40,0,0,0,38,
            0,1,2,3,4,5,6,7,8,9,
            10,0,1,2,3,4,5,6,7,8,
            9,10,0,1,2,3,4,5,6,7,
            8,9,10,0,1,2,3,4,5,6,
            7,8,9,10,0,0,0,99,0,1,
            2,3,4,5,6,7,8,9,10,0,
            1,2,3,4,5,6,7,8,9,10,
            0,1,2,3,4,5,6,7,8,9,
            10,0,0,1,2,3,4,5,6,7,
            8,0,1,2,3,4,5,6,7,8,
            0,0,0,0,0,0,25,0,0,28,
            29,30,31,32,33,34,0,1,2,3,
            4,5,6,7,8,0,1,2,3,4,
            5,6,7,8,0,1,2,3,4,5,
            6,7,8,0,1,2,3,4,5,6,
            7,8,0,1,2,3,4,5,6,7,
            8,0,1,2,3,4,5,6,7,8,
            0,1,2,3,4,5,6,7,8,0,
            0,0,0,0,0,0,0,0,0,0,
            11,0,11,11,11,11,11,11,11,11,
            99,0,11,99,0,0,27,0,27,27,
            0,27,27,24,35,26,35,35,11,0,
            0,42,0,42,42,24,0,26,48,49,
            47,43,0,11,24,0,26,11,0,0,
            0,0,0,11,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,78,0,
            0,0,83,0,0,0,0,84,0,0,
            0,0,0,0,0,0,0,0,0,0,
            100,101,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0,0,0,0,0,0,
            0,0,0,0,0
        };
    };
    public final static byte termCheck[] = TermCheck.termCheck;
    public final int termCheck(int index) { return termCheck[index]; }

    public interface TermAction {
        public final static char termAction[] = {0,
            716,814,814,814,814,814,814,814,814,814,
            814,814,814,814,814,814,814,814,814,814,
            814,814,814,814,814,814,814,814,814,814,
            814,814,814,814,814,814,814,814,814,814,
            814,814,814,814,814,814,814,543,814,814,
            814,814,814,814,814,814,814,814,814,814,
            814,814,814,814,814,814,814,814,814,814,
            814,814,814,814,814,814,814,814,814,814,
            814,814,814,814,813,814,814,814,814,814,
            814,814,814,814,814,814,814,814,814,107,
            814,814,716,812,812,812,812,812,812,812,
            812,812,812,812,812,812,812,812,812,812,
            812,812,812,812,812,812,812,812,812,812,
            812,812,812,812,812,812,812,812,812,812,
            812,812,812,812,812,812,812,812,812,817,
            812,812,812,812,812,812,812,812,812,812,
            812,812,812,812,812,812,812,812,812,812,
            812,812,812,812,812,812,812,812,812,812,
            812,812,812,812,812,812,811,812,812,812,
            812,812,812,812,812,812,812,812,812,812,
            812,105,812,812,102,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,820,820,820,820,820,820,820,
            820,820,820,99,716,716,820,716,531,704,
            704,704,704,704,704,704,704,704,576,703,
            703,703,703,703,703,703,703,703,703,703,
            703,703,703,703,473,703,703,703,703,703,
            703,703,586,703,703,463,508,512,577,478,
            600,703,703,716,581,705,705,703,703,703,
            703,703,703,703,703,703,703,703,703,703,
            703,703,703,703,703,703,703,703,703,703,
            703,703,703,703,703,705,510,524,703,497,
            559,603,530,468,759,542,744,756,757,754,
            755,758,742,739,740,716,716,705,705,716,
            824,824,824,824,824,824,824,824,824,824,
            824,824,824,824,824,824,824,824,824,824,
            824,824,824,824,824,824,824,824,824,824,
            824,824,824,824,824,824,824,824,719,824,
            824,824,824,824,824,676,824,824,824,824,
            824,824,824,824,824,824,824,824,824,824,
            824,824,824,824,824,824,824,824,824,824,
            824,824,824,824,824,824,824,824,824,824,
            824,824,824,824,824,824,824,824,824,824,
            824,824,824,824,824,824,824,824,716,822,
            822,822,822,822,822,822,822,822,822,822,
            822,822,822,822,822,822,822,822,822,822,
            822,822,822,822,822,822,822,822,822,822,
            822,822,822,822,822,822,822,822,822,718,
            822,822,822,822,661,822,822,822,822,822,
            822,822,822,822,822,822,822,822,822,822,
            822,822,822,822,822,822,822,822,822,822,
            822,822,822,822,822,822,822,822,822,822,
            822,822,822,822,822,822,822,822,822,822,
            822,822,822,822,822,822,822,716,700,700,
            700,700,700,700,700,700,700,700,700,700,
            700,700,700,700,700,700,700,700,700,700,
            700,700,700,700,700,700,700,700,700,700,
            700,700,700,700,700,700,700,716,700,700,
            700,700,700,520,700,700,700,700,700,700,
            700,700,700,700,700,700,700,700,700,700,
            700,700,700,700,700,700,700,700,700,700,
            700,700,700,700,700,700,700,700,700,700,
            700,700,700,700,700,700,700,700,700,700,
            700,700,700,700,700,700,1,954,954,954,
            954,954,954,954,954,954,954,716,953,953,
            953,953,953,953,953,953,953,953,953,953,
            953,953,953,88,953,953,953,953,953,953,
            953,33,953,953,31,800,807,807,800,716,
            953,953,773,716,716,1162,953,953,953,953,
            953,953,953,953,953,953,953,953,953,953,
            953,953,953,953,953,953,953,953,953,953,
            953,953,953,953,716,716,716,953,716,605,
            605,605,605,605,605,605,605,605,605,716,
            605,605,605,605,605,605,605,605,605,605,
            605,605,716,609,609,609,609,609,609,609,
            609,609,609,781,609,609,609,609,609,609,
            609,609,609,609,609,609,68,828,828,828,
            828,828,828,828,828,828,828,716,828,828,
            828,828,828,828,828,828,828,828,828,828,
            716,621,621,621,621,621,621,621,621,621,
            621,716,621,621,621,621,621,621,621,621,
            621,621,621,621,716,625,625,625,625,625,
            625,625,625,625,625,716,625,625,625,625,
            625,625,625,625,625,625,625,625,716,633,
            633,633,633,633,633,633,633,633,633,716,
            633,633,633,633,633,633,633,633,633,633,
            633,633,716,637,637,637,637,637,637,637,
            637,637,637,716,637,637,637,637,637,637,
            637,637,637,637,637,637,716,641,641,641,
            641,641,641,641,641,641,641,716,641,641,
            641,641,641,641,641,641,641,641,641,641,
            716,645,645,645,645,645,645,645,645,645,
            645,716,645,645,645,645,645,645,645,645,
            645,645,645,645,716,1126,1126,1126,1126,1126,
            1126,1126,1126,1126,1126,716,1126,1126,1126,1126,
            1126,1126,1126,1126,1126,1126,1126,1126,716,649,
            649,649,649,649,649,649,649,649,649,716,
            649,649,649,649,649,649,649,649,649,649,
            649,649,716,653,653,653,653,653,653,653,
            653,653,653,716,653,653,653,653,653,653,
            653,653,653,653,653,653,716,1117,1117,1117,
            1117,1117,1117,1117,1117,1117,1117,716,1117,1117,
            1117,1117,1117,1117,1117,1117,1117,1117,1117,1117,
            716,1135,1135,1135,1135,1135,1135,1135,1135,1135,
            1135,716,1135,1135,1135,1135,1135,1135,1135,1135,
            1135,1135,1135,1135,67,826,826,826,826,826,
            826,826,826,826,826,716,802,809,809,802,
            716,659,659,716,706,707,708,709,710,711,
            712,713,431,37,30,1140,716,716,716,1137,
            27,716,657,1159,765,776,716,596,1139,716,
            1118,1118,1118,1118,1118,1118,1118,1118,716,1141,
            1138,1140,1142,1143,1144,1137,715,1151,716,1145,
            782,716,73,613,1139,716,706,707,708,709,
            710,711,712,713,716,1141,1138,1140,1142,1143,
            1144,1137,14,716,109,1145,798,32,798,617,
            1139,716,716,6,799,806,806,799,774,560,
            560,1141,1138,1153,1142,1143,1144,716,67,67,
            67,1145,67,67,67,67,67,67,67,213,
            907,908,909,910,911,912,913,914,588,588,
            94,677,677,677,677,677,677,677,677,677,
            677,716,677,677,677,677,677,677,677,677,
            677,677,36,629,629,629,629,629,629,629,
            629,629,629,29,442,662,780,89,716,716,
            716,716,716,667,775,1167,662,21,109,801,
            808,808,801,6,667,716,716,716,771,6,
            701,114,686,686,686,686,686,686,686,686,
            686,686,67,67,67,440,67,67,67,67,
            67,67,67,578,672,578,1165,671,564,665,
            671,672,564,665,697,720,716,716,716,1168,
            113,826,826,826,826,826,826,826,826,826,
            826,716,688,688,688,688,688,688,688,688,
            688,688,716,691,691,691,691,691,691,691,
            691,691,691,116,826,826,826,826,826,826,
            826,826,826,826,716,716,716,6,115,826,
            826,826,826,826,826,826,826,826,826,118,
            826,826,826,826,826,826,826,826,826,826,
            117,826,826,826,826,826,826,826,826,826,
            826,78,214,907,908,909,910,911,912,913,
            914,213,191,191,191,191,191,191,191,191,
            716,236,716,716,234,716,790,716,716,792,
            797,795,792,790,797,795,213,192,192,192,
            192,192,192,192,192,213,193,193,193,193,
            193,193,193,193,213,194,194,194,194,194,
            194,194,194,213,195,195,195,195,195,195,
            195,195,213,196,196,196,196,196,196,196,
            196,213,197,197,197,197,197,197,197,197,
            213,198,198,198,198,198,198,198,198,34,
            18,35,20,22,25,51,441,438,19,72,
            763,50,764,770,772,762,778,1166,1163,769,
            1,71,777,18,716,716,694,436,693,699,
            69,1149,702,796,695,796,683,761,1161,716,
            716,696,439,631,698,793,432,793,951,951,
            469,760,52,1164,791,716,791,1160,716,716,
            716,716,716,779,716,716,716,716,716,716,
            716,716,716,716,716,716,716,716,951,716,
            716,716,1150,716,716,716,716,819,716,716,
            716,716,716,716,716,716,716,716,716,716,
            951,951
        };
    };
    public final static char termAction[] = TermAction.termAction;
    public final int termAction(int index) { return termAction[index]; }
    public final int asb(int index) { return 0; }
    public final int asr(int index) { return 0; }
    public final int nasb(int index) { return 0; }
    public final int nasr(int index) { return 0; }
    public final int terminalIndex(int index) { return 0; }
    public final int nonterminalIndex(int index) { return 0; }
    public final int scopePrefix(int index) { return 0;}
    public final int scopeSuffix(int index) { return 0;}
    public final int scopeLhs(int index) { return 0;}
    public final int scopeLa(int index) { return 0;}
    public final int scopeStateSet(int index) { return 0;}
    public final int scopeRhs(int index) { return 0;}
    public final int scopeState(int index) { return 0;}
    public final int inSymb(int index) { return 0;}
    public final String name(int index) { return null; }
    public final int originalState(int state) { return 0; }
    public final int asi(int state) { return 0; }
    public final int nasi(int state) { return 0; }
    public final int inSymbol(int state) { return 0; }

    /**
     * assert(! goto_default);
     */
    public final int ntAction(int state, int sym) {
        return baseAction[state + sym];
    }

    /**
     * assert(! shift_default);
     */
    public final int tAction(int state, int sym) {
        int i = baseAction[state],
            k = i + sym;
        return termAction[termCheck[k] == sym ? k : i];
    }
    public final int lookAhead(int la_state, int sym) {
        int k = la_state + sym;
        return termAction[termCheck[k] == sym ? k : la_state];
    }
}
