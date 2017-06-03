/* The following code was generated by JFlex 1.6.1 */

/*
 * Simple Caclulater Lexer
 * Lexer.flex
 */

// section 1: user code copied verbatim


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int Comment = 2;
  public static final int StartString = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\1\77\10\0\1\102\1\7\1\10\1\10\1\10\22\0\1\102\1\0"+
    "\1\74\5\0\1\5\1\11\1\6\1\33\1\14\1\12\1\15\1\32"+
    "\1\101\11\3\1\13\1\45\1\35\1\34\1\36\1\0\1\16\1\53"+
    "\1\4\1\55\1\31\1\47\1\57\1\4\1\61\1\21\2\4\1\51"+
    "\1\71\1\40\1\27\1\65\1\4\1\63\1\23\1\42\1\73\1\25"+
    "\1\67\1\4\1\4\1\4\1\0\1\76\2\0\1\2\1\0\1\52"+
    "\1\1\1\54\1\30\1\46\1\56\1\1\1\60\1\20\2\1\1\50"+
    "\1\70\1\37\1\26\1\64\1\1\1\62\1\22\1\41\1\72\1\24"+
    "\1\66\1\100\2\1\1\43\1\0\1\44\1\17\6\0\1\10\32\0"+
    "\1\75\u15df\0\1\75\u097f\0\13\75\35\0\1\10\1\10\5\0\1\75"+
    "\57\0\1\75\u0fa0\0\1\75\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\ud00f\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\2"+
    "\1\4\1\2\1\4\1\2\1\4\1\17\1\20\1\21"+
    "\1\22\1\2\1\4\1\2\1\4\1\23\1\24\1\25"+
    "\1\2\1\4\1\2\1\4\1\2\1\4\1\2\1\4"+
    "\1\2\1\4\1\2\1\4\1\26\3\27\1\30\1\27"+
    "\1\31\1\32\1\31\1\33\1\31\1\34\1\7\1\2"+
    "\1\35\1\36\1\4\1\35\1\36\2\2\1\4\2\37"+
    "\1\40\1\41\1\42\2\2\2\4\2\2\1\4\2\2"+
    "\2\4\2\2\2\4\2\2\2\4\1\43\1\2\1\43"+
    "\1\2\1\4\1\2\1\4\1\44\1\45\4\0\1\46"+
    "\1\47\1\50\2\0\2\2\2\4\2\2\1\4\1\51"+
    "\1\52\1\51\1\52\2\2\1\4\2\2\2\4\1\2"+
    "\1\53\1\4\1\53\2\2\2\4\2\2\1\4\1\2"+
    "\1\4\3\0\1\54\2\2\2\4\1\55\2\25\1\56"+
    "\1\57\1\56\1\60\1\61\1\60\1\61\2\62\1\2"+
    "\1\63\1\4\1\63\1\2\2\64\1\2\1\4\2\65"+
    "\2\2\2\4\2\66\1\67\2\70\1\71\1\2\1\71"+
    "\1\4\1\2\1\4\2\72";

  private static int [] zzUnpackAction() {
    int [] result = new int[189];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\103\0\206\0\311\0\u010c\0\u014f\0\u0192\0\u01d5"+
    "\0\311\0\311\0\311\0\u0218\0\311\0\311\0\311\0\311"+
    "\0\311\0\u025b\0\u029e\0\u02e1\0\u0324\0\u0367\0\u03aa\0\311"+
    "\0\311\0\u03ed\0\u0430\0\u0473\0\u04b6\0\u04f9\0\u053c\0\311"+
    "\0\311\0\311\0\u057f\0\u05c2\0\u0605\0\u0648\0\u068b\0\u06ce"+
    "\0\u0711\0\u0754\0\u0797\0\u07da\0\u081d\0\u0860\0\311\0\311"+
    "\0\u08a3\0\u08e6\0\311\0\u0929\0\311\0\311\0\u096c\0\311"+
    "\0\u09af\0\u09f2\0\u0a35\0\u0a78\0\u0abb\0\u010c\0\u0afe\0\u0b41"+
    "\0\u0192\0\u0b84\0\u0bc7\0\u0c0a\0\u010c\0\u0192\0\311\0\311"+
    "\0\311\0\u0c4d\0\u0c90\0\u0cd3\0\u0d16\0\u0d59\0\u0d9c\0\u0ddf"+
    "\0\u0e22\0\u0e65\0\u0ea8\0\u0eeb\0\u0f2e\0\u0f71\0\u0fb4\0\u0ff7"+
    "\0\u103a\0\u107d\0\u10c0\0\u1103\0\u010c\0\u1146\0\u0192\0\u1189"+
    "\0\u11cc\0\u120f\0\u1252\0\311\0\311\0\u1295\0\u12d8\0\u131b"+
    "\0\u135e\0\311\0\311\0\311\0\u09f2\0\u13a1\0\u13e4\0\u1427"+
    "\0\u146a\0\u14ad\0\u14f0\0\u1533\0\u1576\0\u010c\0\u010c\0\u0192"+
    "\0\u0192\0\u15b9\0\u15fc\0\u163f\0\u1682\0\u16c5\0\u1708\0\u174b"+
    "\0\u178e\0\u010c\0\u17d1\0\u0192\0\u1814\0\u1857\0\u189a\0\u18dd"+
    "\0\u1920\0\u1963\0\u19a6\0\u19e9\0\u1a2c\0\u1a6f\0\u1ab2\0\u1af5"+
    "\0\u09f2\0\u1b38\0\u1b7b\0\u1bbe\0\u1c01\0\u010c\0\u010c\0\u0192"+
    "\0\u010c\0\u010c\0\u0192\0\u010c\0\u010c\0\u0192\0\u0192\0\u010c"+
    "\0\u0192\0\u1c44\0\u010c\0\u1c87\0\u0192\0\u1cca\0\u010c\0\u0192"+
    "\0\u1d0d\0\u1d50\0\u1a6f\0\u1af5\0\u1d93\0\u1dd6\0\u1e19\0\u1e5c"+
    "\0\u010c\0\u0192\0\u010c\0\u010c\0\u0192\0\u010c\0\u1e9f\0\u0192"+
    "\0\u1ee2\0\u1f25\0\u1f68\0\u010c\0\u0192";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[189];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\4\1\6\1\7\1\10\1\11\2\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\22"+
    "\1\23\1\24\1\25\1\5\1\7\1\26\1\27\1\5"+
    "\1\7\1\30\1\31\1\32\1\33\1\4\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
    "\1\46\1\5\1\7\1\47\1\50\1\51\1\52\1\5"+
    "\1\7\1\5\1\7\1\53\1\54\1\55\1\56\1\5"+
    "\1\7\1\5\1\7\1\57\1\12\2\4\1\5\1\6"+
    "\1\12\5\60\1\61\1\62\1\63\64\60\1\64\5\60"+
    "\1\63\74\65\1\66\1\65\1\67\1\70\1\71\2\65"+
    "\104\0\4\5\13\0\12\5\5\0\4\5\3\0\26\5"+
    "\4\0\2\5\4\0\1\6\75\0\1\6\2\0\4\7"+
    "\13\0\12\7\5\0\4\7\3\0\26\7\4\0\2\7"+
    "\7\0\1\72\106\0\1\73\71\0\4\5\13\0\2\5"+
    "\2\74\6\5\5\0\2\75\2\5\3\0\10\5\2\76"+
    "\14\5\4\0\2\5\2\0\4\7\13\0\2\7\2\77"+
    "\6\7\5\0\2\100\2\7\3\0\10\7\2\101\14\7"+
    "\4\0\2\7\2\0\4\5\13\0\12\5\5\0\4\5"+
    "\3\0\1\102\1\103\24\5\4\0\2\5\2\0\4\7"+
    "\13\0\12\7\5\0\4\7\3\0\2\104\24\7\4\0"+
    "\2\7\2\0\4\5\13\0\12\5\5\0\4\5\3\0"+
    "\10\5\2\105\14\5\4\0\2\5\2\0\4\7\13\0"+
    "\12\7\5\0\4\7\3\0\10\7\2\106\14\7\4\0"+
    "\2\7\37\0\1\107\56\0\1\110\21\0\1\111\47\0"+
    "\4\5\13\0\6\5\2\112\2\5\5\0\4\5\3\0"+
    "\2\113\24\5\4\0\2\5\2\0\4\7\13\0\6\7"+
    "\2\114\2\7\5\0\4\7\3\0\2\115\24\7\4\0"+
    "\2\7\2\0\4\5\13\0\12\5\5\0\4\5\3\0"+
    "\12\5\2\116\2\117\10\5\4\0\2\5\2\0\4\7"+
    "\13\0\12\7\5\0\4\7\3\0\12\7\2\120\12\7"+
    "\4\0\2\7\2\0\4\5\13\0\2\5\2\121\6\5"+
    "\5\0\4\5\3\0\2\5\2\122\22\5\4\0\2\5"+
    "\2\0\4\7\13\0\2\7\2\123\6\7\5\0\4\7"+
    "\3\0\2\7\2\124\22\7\4\0\2\7\2\0\4\5"+
    "\13\0\6\5\2\125\2\5\5\0\4\5\3\0\2\126"+
    "\24\5\4\0\2\5\2\0\4\7\13\0\6\7\2\127"+
    "\2\7\5\0\4\7\3\0\2\130\24\7\4\0\2\7"+
    "\2\0\4\5\13\0\12\5\5\0\4\5\3\0\2\5"+
    "\2\131\2\132\20\5\4\0\2\5\2\0\4\7\13\0"+
    "\12\7\5\0\4\7\3\0\2\7\2\133\2\134\20\7"+
    "\4\0\2\7\2\0\4\5\13\0\2\135\10\5\5\0"+
    "\4\5\3\0\4\5\2\136\20\5\4\0\2\5\2\0"+
    "\4\7\13\0\2\137\10\7\5\0\4\7\3\0\26\7"+
    "\4\0\2\7\2\0\4\5\13\0\6\5\2\140\2\5"+
    "\5\0\4\5\3\0\26\5\4\0\2\5\2\0\4\7"+
    "\13\0\6\7\2\141\2\7\5\0\4\7\3\0\26\7"+
    "\4\0\2\7\2\0\4\5\13\0\12\5\5\0\4\5"+
    "\3\0\12\5\2\142\12\5\4\0\2\5\2\0\4\7"+
    "\13\0\12\7\5\0\4\7\3\0\12\7\2\143\12\7"+
    "\4\0\2\7\7\0\1\144\105\0\1\145\71\0\5\146"+
    "\1\147\1\150\2\151\72\146\37\0\1\152\16\0\1\152"+
    "\3\0\1\152\11\0\1\153\4\0\1\154\31\0\1\70"+
    "\21\0\1\70\30\0\6\155\1\156\2\0\72\155\7\73"+
    "\2\0\72\73\1\0\4\5\13\0\4\5\2\157\4\5"+
    "\5\0\4\5\3\0\26\5\4\0\2\5\2\0\4\5"+
    "\13\0\12\5\5\0\4\5\3\0\12\5\2\160\12\5"+
    "\4\0\2\5\2\0\4\7\13\0\4\7\2\161\4\7"+
    "\5\0\4\7\3\0\26\7\4\0\2\7\2\0\4\7"+
    "\13\0\12\7\5\0\4\7\3\0\12\7\2\162\12\7"+
    "\4\0\2\7\2\0\4\5\13\0\12\5\5\0\4\5"+
    "\3\0\2\5\1\163\17\5\2\164\2\5\4\0\2\5"+
    "\2\0\4\5\13\0\12\5\5\0\4\5\3\0\22\5"+
    "\2\164\2\5\4\0\2\5\2\0\4\7\13\0\12\7"+
    "\5\0\4\7\3\0\22\7\2\165\2\7\4\0\2\7"+
    "\2\0\4\5\13\0\12\5\5\0\2\5\2\166\3\0"+
    "\26\5\4\0\2\5\2\0\4\5\13\0\12\5\5\0"+
    "\4\5\3\0\20\5\2\167\4\5\4\0\2\5\2\0"+
    "\4\7\13\0\12\7\5\0\2\7\2\170\3\0\26\7"+
    "\4\0\2\7\2\0\4\7\13\0\12\7\5\0\4\7"+
    "\3\0\20\7\2\171\4\7\4\0\2\7\2\0\4\5"+
    "\13\0\12\5\5\0\4\5\3\0\2\172\24\5\4\0"+
    "\2\5\2\0\4\5\13\0\12\5\5\0\4\5\3\0"+
    "\24\5\2\173\4\0\2\5\2\0\4\7\13\0\12\7"+
    "\5\0\4\7\3\0\2\174\24\7\4\0\2\7\2\0"+
    "\4\5\13\0\12\5\5\0\4\5\3\0\4\5\2\175"+
    "\20\5\4\0\2\5\2\0\4\5\13\0\2\5\2\176"+
    "\6\5\5\0\4\5\3\0\26\5\4\0\2\5\2\0"+
    "\4\7\13\0\12\7\5\0\4\7\3\0\4\7\2\177"+
    "\20\7\4\0\2\7\2\0\4\7\13\0\2\7\2\200"+
    "\6\7\5\0\4\7\3\0\26\7\4\0\2\7\2\0"+
    "\4\5\13\0\6\5\2\201\2\5\5\0\4\5\3\0"+
    "\26\5\4\0\2\5\2\0\4\5\13\0\12\5\5\0"+
    "\2\5\2\202\3\0\26\5\4\0\2\5\2\0\4\7"+
    "\13\0\6\7\2\203\2\7\5\0\4\7\3\0\26\7"+
    "\4\0\2\7\2\0\4\7\13\0\12\7\5\0\2\7"+
    "\2\204\3\0\26\7\4\0\2\7\2\0\4\5\13\0"+
    "\12\5\5\0\4\5\3\0\4\5\2\205\20\5\4\0"+
    "\2\5\2\0\4\5\13\0\2\5\2\206\6\5\5\0"+
    "\4\5\3\0\26\5\4\0\2\5\2\0\4\7\13\0"+
    "\12\7\5\0\4\7\3\0\4\7\2\207\20\7\4\0"+
    "\2\7\2\0\4\7\13\0\2\7\2\210\6\7\5\0"+
    "\4\7\3\0\26\7\4\0\2\7\2\0\4\5\13\0"+
    "\12\5\5\0\4\5\3\0\2\5\2\211\22\5\4\0"+
    "\2\5\2\0\4\5\13\0\6\5\2\212\2\5\5\0"+
    "\4\5\3\0\26\5\4\0\2\5\2\0\4\7\13\0"+
    "\6\7\2\213\2\7\5\0\4\7\3\0\26\7\4\0"+
    "\2\7\2\0\4\5\13\0\2\214\10\5\5\0\4\5"+
    "\3\0\26\5\4\0\2\5\2\0\4\7\13\0\2\215"+
    "\10\7\5\0\4\7\3\0\26\7\4\0\2\7\1\0"+
    "\7\216\2\217\101\216\2\217\1\146\77\216\1\150\2\217"+
    "\72\216\103\220\6\155\1\156\2\0\1\221\71\155\1\0"+
    "\4\5\13\0\6\5\2\222\2\5\5\0\4\5\3\0"+
    "\26\5\4\0\2\5\2\0\4\5\13\0\12\5\5\0"+
    "\4\5\3\0\2\223\24\5\4\0\2\5\2\0\4\7"+
    "\13\0\6\7\2\224\2\7\5\0\4\7\3\0\26\7"+
    "\4\0\2\7\2\0\4\7\13\0\12\7\5\0\4\7"+
    "\3\0\2\225\24\7\4\0\2\7\2\0\4\5\13\0"+
    "\12\5\5\0\4\5\3\0\10\5\1\226\15\5\4\0"+
    "\2\5\2\0\4\5\13\0\2\227\10\5\5\0\4\5"+
    "\3\0\26\5\4\0\2\5\2\0\4\7\13\0\2\230"+
    "\10\7\5\0\4\7\3\0\26\7\4\0\2\7\2\0"+
    "\4\5\13\0\12\5\5\0\2\231\2\5\3\0\26\5"+
    "\4\0\2\5\2\0\4\5\13\0\12\5\5\0\4\5"+
    "\3\0\2\232\24\5\4\0\2\5\2\0\4\7\13\0"+
    "\12\7\5\0\2\233\2\7\3\0\26\7\4\0\2\7"+
    "\2\0\4\5\13\0\12\5\5\0\4\5\3\0\6\5"+
    "\2\234\16\5\4\0\2\5\2\0\4\5\13\0\12\5"+
    "\5\0\4\5\3\0\2\235\24\5\4\0\2\5\2\0"+
    "\4\7\13\0\12\7\5\0\4\7\3\0\6\7\2\236"+
    "\16\7\4\0\2\7\2\0\4\7\13\0\12\7\5\0"+
    "\4\7\3\0\2\237\24\7\4\0\2\7\2\0\4\5"+
    "\13\0\12\5\5\0\4\5\3\0\16\5\2\240\6\5"+
    "\4\0\2\5\2\0\4\7\13\0\12\7\5\0\4\7"+
    "\3\0\16\7\2\241\6\7\4\0\2\7\2\0\4\5"+
    "\13\0\2\5\2\242\6\5\5\0\4\5\3\0\26\5"+
    "\4\0\2\5\2\0\4\5\13\0\12\5\5\0\4\5"+
    "\3\0\2\243\24\5\4\0\2\5\2\0\4\7\13\0"+
    "\2\7\2\244\6\7\5\0\4\7\3\0\26\7\4\0"+
    "\2\7\2\0\4\7\13\0\12\7\5\0\4\7\3\0"+
    "\2\245\24\7\4\0\2\7\2\0\4\5\13\0\2\5"+
    "\2\246\6\5\5\0\4\5\3\0\26\5\4\0\2\5"+
    "\2\0\4\5\13\0\12\5\5\0\4\5\3\0\2\5"+
    "\2\247\22\5\4\0\2\5\2\0\4\7\13\0\12\7"+
    "\5\0\4\7\3\0\2\7\2\250\22\7\4\0\2\7"+
    "\2\0\4\5\13\0\12\5\5\0\4\5\3\0\2\5"+
    "\2\251\22\5\4\0\2\5\2\0\4\7\13\0\12\7"+
    "\5\0\4\7\3\0\2\7\2\252\22\7\4\0\2\7"+
    "\1\0\7\216\2\217\63\216\1\253\6\216\74\220\1\254"+
    "\15\220\2\0\63\220\1\254\6\220\1\0\4\5\13\0"+
    "\2\255\10\5\5\0\4\5\3\0\26\5\4\0\2\5"+
    "\2\0\4\5\13\0\12\5\5\0\4\5\3\0\14\5"+
    "\2\256\10\5\4\0\2\5\2\0\4\7\13\0\2\257"+
    "\10\7\5\0\4\7\3\0\26\7\4\0\2\7\2\0"+
    "\4\7\13\0\12\7\5\0\4\7\3\0\14\7\2\260"+
    "\10\7\4\0\2\7\2\0\4\5\13\0\2\5\2\261"+
    "\6\5\5\0\4\5\3\0\26\5\4\0\2\5\2\0"+
    "\4\7\13\0\2\7\2\262\6\7\5\0\4\7\3\0"+
    "\26\7\4\0\2\7\2\0\4\5\13\0\12\5\5\0"+
    "\4\5\3\0\2\263\24\5\4\0\2\5\2\0\4\5"+
    "\13\0\12\5\5\0\4\5\3\0\2\264\24\5\4\0"+
    "\2\5\2\0\4\7\13\0\12\7\5\0\4\7\3\0"+
    "\2\265\24\7\4\0\2\7\2\0\4\5\13\0\10\5"+
    "\2\266\5\0\4\5\3\0\26\5\4\0\2\5\2\0"+
    "\4\5\13\0\2\267\10\5\5\0\4\5\3\0\26\5"+
    "\4\0\2\5\2\0\4\7\13\0\10\7\2\270\5\0"+
    "\4\7\3\0\26\7\4\0\2\7\2\0\4\7\13\0"+
    "\2\271\10\7\5\0\4\7\3\0\26\7\4\0\2\7"+
    "\2\0\4\5\13\0\12\5\5\0\2\5\2\272\3\0"+
    "\26\5\4\0\2\5\2\0\4\7\13\0\12\7\5\0"+
    "\2\7\2\273\3\0\26\7\4\0\2\7\2\0\4\5"+
    "\13\0\2\5\2\274\6\5\5\0\4\5\3\0\26\5"+
    "\4\0\2\5\2\0\4\7\13\0\2\7\2\275\6\7"+
    "\5\0\4\7\3\0\26\7\4\0\2\7\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8107];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\4\1\3\11\1\1\5\11\6\1\2\11"+
    "\6\1\3\11\14\1\2\11\2\1\1\11\1\1\2\11"+
    "\1\1\1\11\16\1\3\11\32\1\2\11\4\0\3\11"+
    "\2\0\37\1\3\0\55\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[189];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
   // Code in here is copied verbatim into the Lexer class

   int myCounter = 0;
   String buildString = "";

 	private Token token(tok type) {
 		return new Token(type, yyline+1, yycolumn+1, null);
 	}
  private Token token(tok type, String message, boolean hadError) {
    return new Token(type, yyline+1, message, hadError);
  }
 	private Token token(tok type, Object lexeme) {
    	return new Token(type, yyline+1, yycolumn+1, lexeme);
 	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 242) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            switch (zzLexicalState) {
            case Comment: {
              //System.out.println("ERROR: " + yyline + 1 +  ": Lexer: ");
		return token(tok.STRING, "END OF FILE", true);
            }
            case 190: break;
            case StartString: {
              //System.out.println("ERROR: " + yyline + 1 +  ": Lexer: ");
		return token(tok.STRING, "END OF FILE", true);
            }
            case 191: break;
            default:
        return null;
        }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { // catchall?
		return token(tok.STRING, "Invalid Character", true);
            }
          case 59: break;
          case 2: 
            { String temp = yytext();
			int isZero = temp.indexOf("0");
			if(temp.substring(0, 1).equals("0") && temp.length() > 1)
				return token(tok.STRING, "Invalid Number", true);
			else
				return token(tok.IDENT, yytext());
            }
          case 60: break;
          case 3: 
            { return token(tok.INT, yytext());
            }
          case 61: break;
          case 4: 
            { return token(tok.TYPE, yytext());
            }
          case 62: break;
          case 5: 
            { return token(tok.LPAREN);
            }
          case 63: break;
          case 6: 
            { return token(tok.TIMES);
            }
          case 64: break;
          case 7: 
            { /* ignore */
            }
          case 65: break;
          case 8: 
            { return token(tok.RPAREN);
            }
          case 66: break;
          case 9: 
            { return token(tok.MINUS);
            }
          case 67: break;
          case 10: 
            { return token(tok.COLON);
            }
          case 68: break;
          case 11: 
            { return token(tok.COMMA);
            }
          case 69: break;
          case 12: 
            { return token(tok.DOT);
            }
          case 70: break;
          case 13: 
            { return token(tok.AT);
            }
          case 71: break;
          case 14: 
            { return token(tok.TILDE);
            }
          case 72: break;
          case 15: 
            { return token(tok.DIVIDE);
            }
          case 73: break;
          case 16: 
            { return token(tok.PLUS);
            }
          case 74: break;
          case 17: 
            { return token(tok.EQUALS);
            }
          case 75: break;
          case 18: 
            { return token(tok.LT);
            }
          case 76: break;
          case 19: 
            { return token(tok.LBRACE);
            }
          case 77: break;
          case 20: 
            { return token(tok.RBRACE);
            }
          case 78: break;
          case 21: 
            { return token(tok.SEMI);
            }
          case 79: break;
          case 22: 
            { buildString = "";
    yybegin(StartString);
            }
          case 80: break;
          case 23: 
            { //System.out.println("other: "+yytext());
    /* ignore */
            }
          case 81: break;
          case 24: 
            { //System.out.println("My text whitespace:" + yytext());
            }
          case 82: break;
          case 25: 
            { buildString += yytext();
        if(buildString.length() >= 1024){
          return token(tok.STRING, "Max String Length", true);
        }
            }
          case 83: break;
          case 26: 
            { yybegin(YYINITIAL);
        return token(tok.STRING, buildString);
            }
          case 84: break;
          case 27: 
            { return token(tok.STRING, "Invalid String", true);
            }
          case 85: break;
          case 28: 
            { myCounter = 0;
		yybegin(Comment);
            }
          case 86: break;
          case 29: 
            { return token(tok.IN);
            }
          case 87: break;
          case 30: 
            { return token(tok.IF);
            }
          case 88: break;
          case 31: 
            { return token(tok.OF);
            }
          case 89: break;
          case 32: 
            { return token(tok.RARROW);
            }
          case 90: break;
          case 33: 
            { return token(tok.LARROW);
            }
          case 91: break;
          case 34: 
            { return token(tok.LE);
            }
          case 92: break;
          case 35: 
            { return token(tok.FI);
            }
          case 93: break;
          case 36: 
            { //System.out.println("open: "+yytext());

				myCounter ++;
            }
          case 94: break;
          case 37: 
            { //System.out.println("close: "+ yytext() + myCounter);

				if(myCounter == 0)
					yybegin(YYINITIAL);
				else
					myCounter --;
            }
          case 95: break;
          case 38: 
            { // catches a typed newline
        buildString += yytext();
        if(buildString.length() >= 1024){
          return token(tok.STRING, "Max String Length", true);
          }
            }
          case 96: break;
          case 39: 
            { buildString += yytext();
            if(buildString.length() >= 1024){
              return token(tok.STRING, "Max String Length", true);
            }
            }
          case 97: break;
          case 40: 
            { buildString += yytext();
        if(buildString.length() >= 1024){
          return token(tok.STRING, "Max String Length", true);
          }
            }
          case 98: break;
          case 41: 
            { return token(tok.NOT);
            }
          case 99: break;
          case 42: 
            { return token(tok.NEW);
            }
          case 100: break;
          case 43: 
            { return token(tok.LET);
            }
          case 101: break;
          case 44: 
            { //	System.out.println("Why not!");
            }
          case 102: break;
          case 45: 
            { return token(tok.IDENT, yytext());
            }
          case 103: break;
          case 46: 
            { return token(tok.THEN);
            }
          case 104: break;
          case 47: 
            { return token(tok.TRUE);
            }
          case 105: break;
          case 48: 
            { return token(tok.ESAC);
            }
          case 106: break;
          case 49: 
            { return token(tok.ELSE);
            }
          case 107: break;
          case 50: 
            { return token(tok.LOOP);
            }
          case 108: break;
          case 51: 
            { return token(tok.CASE);
            }
          case 109: break;
          case 52: 
            { return token(tok.POOL);
            }
          case 110: break;
          case 53: 
            { 
            }
          case 111: break;
          case 54: 
            { return token(tok.CLASS);
            }
          case 112: break;
          case 55: 
            { return token(tok.FALSE);
            }
          case 113: break;
          case 56: 
            { return token(tok.WHILE);
            }
          case 114: break;
          case 57: 
            { return token(tok.ISVOID);
            }
          case 115: break;
          case 58: 
            { return token(tok.INHERITS);
            }
          case 116: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
