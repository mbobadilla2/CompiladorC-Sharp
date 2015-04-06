package javacc;

import java.util.ArrayList;
import javacc.CompiladorC_SharpConstants;
/** Token Manager. */
/*@SuppressWarnings("unused")*/public class CompiladorC_SharpTokenManager implements CompiladorC_SharpConstants {
   static ArrayList<String> lista = CompiladorC_Sharp.lista;
   static ArrayList<String> errores = CompiladorC_Sharp.errores;

  /** Debug output. */
  public  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x820000000000000L) != 0L || (active1 & 0x100L) != 0L)
            return 10;
         if ((active0 & 0xff0ffffffeL) != 0L)
         {
            jjmatchedKind = 71;
            return 7;
         }
         return -1;
      case 1:
         if ((active0 & 0x4800L) != 0L)
            return 7;
         if ((active0 & 0xff0fffb7feL) != 0L)
         {
            jjmatchedKind = 71;
            jjmatchedPos = 1;
            return 7;
         }
         return -1;
      case 2:
         if ((active0 & 0x802000L) != 0L)
            return 7;
         if ((active0 & 0xff0f7f97feL) != 0L)
         {
            jjmatchedKind = 71;
            jjmatchedPos = 2;
            return 7;
         }
         return -1;
      case 3:
         if ((active0 & 0xfa035d82feL) != 0L)
         {
            jjmatchedKind = 71;
            jjmatchedPos = 3;
            return 7;
         }
         if ((active0 & 0x50c221500L) != 0L)
            return 7;
         return -1;
      case 4:
         if ((active0 & 0xc8025902f2L) != 0L)
         {
            if (jjmatchedPos != 4)
            {
               jjmatchedKind = 71;
               jjmatchedPos = 4;
            }
            return 7;
         }
         if ((active0 & 0x320104800cL) != 0L)
            return 7;
         return -1;
      case 5:
         if ((active0 & 0xd8001800d2L) != 0L)
         {
            jjmatchedKind = 71;
            jjmatchedPos = 5;
            return 7;
         }
         if ((active0 & 0x2410220L) != 0L)
            return 7;
         return -1;
      case 6:
         if ((active0 & 0x5000100042L) != 0L)
         {
            jjmatchedKind = 71;
            jjmatchedPos = 6;
            return 7;
         }
         if ((active0 & 0x8800080090L) != 0L)
            return 7;
         return -1;
      case 7:
         if ((active0 & 0x1000000042L) != 0L)
         {
            jjmatchedKind = 71;
            jjmatchedPos = 7;
            return 7;
         }
         if ((active0 & 0x4000100000L) != 0L)
            return 7;
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x10L);
      case 37:
         jjmatchedKind = 54;
         return jjMoveStringLiteralDfa1_0(0x1000000000000000L, 0x0L);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x20L);
      case 40:
         return jjStopAtPos(0, 43);
      case 41:
         return jjStopAtPos(0, 42);
      case 42:
         jjmatchedKind = 52;
         return jjMoveStringLiteralDfa1_0(0x400000000000000L, 0x400L);
      case 43:
         jjmatchedKind = 50;
         return jjMoveStringLiteralDfa1_0(0x2100000000000000L, 0x0L);
      case 44:
         return jjStopAtPos(0, 47);
      case 45:
         jjmatchedKind = 51;
         return jjMoveStringLiteralDfa1_0(0x4200000000000000L, 0x0L);
      case 46:
         return jjStopAtPos(0, 45);
      case 47:
         jjmatchedKind = 53;
         return jjMoveStringLiteralDfa1_0(0x800000000000000L, 0x100L);
      case 58:
         return jjStopAtPos(0, 46);
      case 59:
         return jjStopAtPos(0, 44);
      case 60:
         jjmatchedKind = 64;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x4L);
      case 61:
         jjmatchedKind = 55;
         return jjMoveStringLiteralDfa1_0(0x8000000000000000L, 0x0L);
      case 62:
         jjmatchedKind = 65;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x8L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x800000000L, 0x0L);
      case 77:
         return jjMoveStringLiteralDfa1_0(0x100L, 0x0L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0xc000000000L, 0x0L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x3000000000L, 0x0L);
      case 91:
         return jjStopAtPos(0, 48);
      case 93:
         return jjStopAtPos(0, 49);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x8040000L, 0x0L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x4120008L, 0x0L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x84000L, 0x0L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x1000L, 0x0L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x201002080L, 0x0L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x400L, 0x0L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x800800L, 0x0L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x400000002L, 0x0L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x70L, 0x0L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x200L, 0x0L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x2410000L, 0x0L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x100000000L, 0x0L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x4L, 0x0L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x200000L, 0x0L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x8000L, 0x0L);
      case 123:
         return jjStopAtPos(0, 40);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x40L);
      case 125:
         return jjStopAtPos(0, 41);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private int jjMoveStringLiteralDfa1_0(long active0, long active1)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active1 & 0x20L) != 0L)
            return jjStopAtPos(1, 69);
         break;
      case 43:
         if ((active0 & 0x2000000000000000L) != 0L)
            return jjStopAtPos(1, 61);
         break;
      case 45:
         if ((active0 & 0x4000000000000000L) != 0L)
            return jjStopAtPos(1, 62);
         break;
      case 47:
         if ((active1 & 0x100L) != 0L)
            return jjStopAtPos(1, 72);
         else if ((active1 & 0x400L) != 0L)
            return jjStopAtPos(1, 74);
         break;
      case 61:
         if ((active0 & 0x100000000000000L) != 0L)
            return jjStopAtPos(1, 56);
         else if ((active0 & 0x200000000000000L) != 0L)
            return jjStopAtPos(1, 57);
         else if ((active0 & 0x400000000000000L) != 0L)
            return jjStopAtPos(1, 58);
         else if ((active0 & 0x800000000000000L) != 0L)
            return jjStopAtPos(1, 59);
         else if ((active0 & 0x1000000000000000L) != 0L)
            return jjStopAtPos(1, 60);
         else if ((active0 & 0x8000000000000000L) != 0L)
            return jjStopAtPos(1, 63);
         else if ((active1 & 0x4L) != 0L)
            return jjStopAtPos(1, 66);
         else if ((active1 & 0x8L) != 0L)
            return jjStopAtPos(1, 67);
         else if ((active1 & 0x10L) != 0L)
            return jjStopAtPos(1, 68);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x200020102L, active1, 0L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0xc000080200L, active1, 0L);
      case 102:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(1, 11, 7);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x4008000L, active1, 0L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x1001008L, active1, 0L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L, active1, 0L);
      case 111:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(1, 14, 7);
         return jjMoveStringLiteralDfa2_0(active0, 0x808302400L, active1, 0L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x3100040050L, active1, 0L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x4L, active1, 0L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x2400000L, active1, 0L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000a0L, active1, 0L);
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L, active1, 0L);
      case 124:
         if ((active1 & 0x40L) != 0L)
            return jjStopAtPos(1, 70);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0xc004400008L);
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x20L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x3000218114L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x600000000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0x2L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x800100080L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x9000040L);
      case 114:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(2, 13, 7);
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x21000L);
      case 116:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(2, 23, 7);
         return jjMoveStringLiteralDfa3_0(active0, 0x600L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, 0L);
}
private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x10c0000L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 100:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(3, 21, 7);
         return jjMoveStringLiteralDfa4_0(active0, 0xc000000000L);
      case 101:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(3, 12, 7);
         else if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 7);
         else if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(3, 32, 7);
         return jjMoveStringLiteralDfa4_0(active0, 0x2L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 108:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(3, 27, 7);
         else if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(3, 34, 7);
         return jjMoveStringLiteralDfa4_0(active0, 0x8020L);
      case 110:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 7);
         return jjMoveStringLiteralDfa4_0(active0, 0x4L);
      case 111:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(3, 10, 7);
         break;
      case 114:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(3, 26, 7);
         break;
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0xa00000008L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x3000510040L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x200L);
      case 118:
         return jjMoveStringLiteralDfa4_0(active0, 0x10L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 75:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000000L);
      case 76:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000000L);
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x10L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x10000L);
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 7);
         else if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(4, 33, 7);
         else if ((active0 & 0x2000000000L) != 0L)
         {
            jjmatchedKind = 37;
            jjmatchedPos = 4;
         }
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000040L);
      case 103:
         if ((active0 & 0x4L) != 0L)
            return jjStartNfaWithStates_0(4, 2, 7);
         break;
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x5000a0L);
      case 107:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 18, 7);
         break;
      case 110:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000L);
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 115:
         if ((active0 & 0x8L) != 0L)
            return jjStartNfaWithStates_0(4, 3, 7);
         return jjMoveStringLiteralDfa5_0(active0, 0x2L);
      case 116:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(4, 24, 7);
         break;
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 76:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000000L);
      case 99:
         if ((active0 & 0x20L) != 0L)
            return jjStartNfaWithStates_0(5, 5, 7);
         else if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(5, 22, 7);
         return jjMoveStringLiteralDfa6_0(active0, 0x40L);
      case 101:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000000L);
      case 103:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(5, 25, 7);
         break;
      case 104:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(5, 16, 7);
         break;
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000000L);
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x800080000L);
      case 110:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(5, 9, 7);
         return jjMoveStringLiteralDfa6_0(active0, 0x100000L);
      case 111:
         return jjMoveStringLiteralDfa6_0(active0, 0x80L);
      case 112:
         return jjMoveStringLiteralDfa6_0(active0, 0x2L);
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x10L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x2L);
      case 101:
         if ((active0 & 0x10L) != 0L)
            return jjStartNfaWithStates_0(6, 4, 7);
         else if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(6, 35, 7);
         break;
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000000L);
      case 110:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(6, 7, 7);
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000000L);
      case 116:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(6, 19, 7);
         return jjMoveStringLiteralDfa7_0(active0, 0x40L);
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x100000L);
      case 121:
         if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 39, 7);
         break;
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x2L);
      case 101:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(7, 20, 7);
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 38, 7);
         return jjMoveStringLiteralDfa8_0(active0, 0x40L);
      case 110:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000000000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0, 0L);
      return 8;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(8, 6, 7);
         break;
      case 101:
         if ((active0 & 0x2L) != 0L)
            return jjStartNfaWithStates_0(8, 1, 7);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(8, 36, 7);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0, 0L);
}
private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 17;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 10:
                  if (curChar == 42)
                     jjCheckNAdd(9);
                  if (curChar == 42)
                  {
                     if (kind > 73)
                        kind = 73;
                  }
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 28)
                        kind = 28;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 47)
                     jjCheckNAddTwoStates(9, 10);
                  else if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 4;
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 1:
                  if ((0xffffffff00000000L & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
                  if (curChar == 34 && kind > 29)
                     kind = 29;
                  break;
               case 3:
                  if (curChar == 39)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 4:
                  if ((0x3ff000100000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 5:
                  if (curChar == 39 && kind > 30)
                     kind = 30;
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 71)
                     kind = 71;
                  jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 8:
                  if (curChar == 47)
                     jjCheckNAddTwoStates(9, 10);
                  break;
               case 9:
                  if (curChar == 42 && kind > 73)
                     kind = 73;
                  break;
               case 11:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAddStates(0, 2);
                  break;
               case 12:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAdd(12);
                  break;
               case 13:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(13, 14);
                  break;
               case 14:
                  if (curChar == 46)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 15:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(16);
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAddStates(3, 5);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 71)
                     kind = 71;
                  jjCheckNAdd(7);
                  break;
               case 1:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjAddStates(6, 7);
                  break;
               case 4:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 7:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 71)
                     kind = 71;
                  jjCheckNAdd(7);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 17 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   12, 13, 14, 13, 14, 16, 1, 2, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", "\156\141\155\145\163\160\141\143\145", "\165\163\151\156\147", 
"\143\154\141\163\163", "\160\162\151\166\141\164\145", "\160\165\142\154\151\143", 
"\160\162\157\164\145\143\164\145\144", "\146\165\156\143\151\157\156", "\115\141\151\156", 
"\162\145\164\165\162\156", "\147\157\164\157", "\151\146", "\145\154\163\145", "\146\157\162", 
"\144\157", "\167\150\151\154\145", "\163\167\151\164\143\150", "\143\141\163\145", 
"\142\162\145\141\153", "\144\145\146\141\165\154\164", "\143\157\156\164\151\156\165\145", 
"\166\157\151\144", "\163\164\141\164\151\143", "\151\156\164", "\146\154\157\141\164", 
"\163\164\162\151\156\147", "\143\150\141\162", "\142\157\157\154", null, null, null, null, 
"\164\162\165\145", "\146\141\154\163\145", "\156\165\154\154", "\103\157\156\163\157\154\145", 
"\127\162\151\164\145\114\151\156\145", "\127\162\151\164\145", "\122\145\141\144\114\151\156\145", 
"\122\145\141\144\113\145\171", "\173", "\175", "\51", "\50", "\73", "\56", "\72", "\54", "\133", "\135", 
"\53", "\55", "\52", "\57", "\45", "\75", "\53\75", "\55\75", "\52\75", "\57\75", 
"\45\75", "\53\53", "\55\55", "\75\75", "\74", "\76", "\74\75", "\76\75", "\41\75", 
"\46\46", "\174\174", null, "\57\57", null, "\52\57", null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffffffffffffffffL, 0x7ffL, 
};
static final long[] jjtoSkip = {
   0x0L, 0x7800L, 
};
protected SimpleCharStream input_stream;
private final int[] jjrounds = new int[17];
private final int[] jjstateSet = new int[34];
private final StringBuilder jjimage = new StringBuilder();
private StringBuilder image = jjimage;
private int jjimageLen;
private int lengthOfMatch;
protected char curChar;
/** Constructor. */
public CompiladorC_SharpTokenManager(SimpleCharStream stream){
   if (SimpleCharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}

/** Constructor. */
public CompiladorC_SharpTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 17; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

/** Get the next Token. */
public Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 1 :
        image.append(jjstrLiteralImages[1]);
        lengthOfMatch = jjstrLiteralImages[1].length();
                                                                                                                //1
                System.out.println("Palabra reservada -> " + image);
                lista.add("Palabra reservada -> " + image);
         break;
      case 2 :
        image.append(jjstrLiteralImages[2]);
        lengthOfMatch = jjstrLiteralImages[2].length();
                                                                                                                //2
                System.out.println("Importacion de libreria -> " + image);
                lista.add("Importacion de libreria -> " + image);
         break;
      case 3 :
        image.append(jjstrLiteralImages[3]);
        lengthOfMatch = jjstrLiteralImages[3].length();
                                                                                                                //3
                System.out.println("Declaracion de clase -> " + image);
                lista.add("Declaracion de clase -> " + image);
         break;
      case 4 :
        image.append(jjstrLiteralImages[4]);
        lengthOfMatch = jjstrLiteralImages[4].length();
                                                                                                                //4
                System.out.println("Acceso Privado -> " + image);
                lista.add("Acceso Privado -> " + image);
         break;
      case 5 :
        image.append(jjstrLiteralImages[5]);
        lengthOfMatch = jjstrLiteralImages[5].length();
                                                                                                                //5
                System.out.println("Acceso Publico -> " + image);
                lista.add("Acceso Publico -> " + image);
         break;
      case 6 :
        image.append(jjstrLiteralImages[6]);
        lengthOfMatch = jjstrLiteralImages[6].length();
                                                                                                        //6
                System.out.println("Acceso Protegido -> " + image);
                lista.add("Acceso Protegido -> " + image);
         break;
      case 7 :
        image.append(jjstrLiteralImages[7]);
        lengthOfMatch = jjstrLiteralImages[7].length();
                                                                                                                //7
                System.out.println("Palabra reservada -> " + image);
                lista.add("Palabra reservada -> " + image);
         break;
      case 8 :
        image.append(jjstrLiteralImages[8]);
        lengthOfMatch = jjstrLiteralImages[8].length();
                                                                                                                        //8
                System.out.println("Nombre funcion principal -> " + image);
                lista.add("Nombre funcion principal -> " + image);
         break;
      case 9 :
        image.append(jjstrLiteralImages[9]);
        lengthOfMatch = jjstrLiteralImages[9].length();
                                                                                                                //9
                System.out.println("Palabra reservada -> " + image);
                lista.add("Pablabra reservada -> " + image);
         break;
      case 10 :
        image.append(jjstrLiteralImages[10]);
        lengthOfMatch = jjstrLiteralImages[10].length();
                                                                                                                        //10
                System.out.println("Palabra reservada -> " + image);
                lista.add("Pablabra reservada -> " + image);
         break;
      case 11 :
        image.append(jjstrLiteralImages[11]);
        lengthOfMatch = jjstrLiteralImages[11].length();
                                                                                                                        //11
                System.out.println("Condicional -> " + image);
                lista.add("Condicional -> " + image);
         break;
      case 12 :
        image.append(jjstrLiteralImages[12]);
        lengthOfMatch = jjstrLiteralImages[12].length();
                                                                                                                        //12
                System.out.println("Condicional -> " + image);
                lista.add("Condicional -> " + image);
         break;
      case 13 :
        image.append(jjstrLiteralImages[13]);
        lengthOfMatch = jjstrLiteralImages[13].length();
                                                                                                                        //13
                System.out.println("Ciclo -> " + image);
                lista.add("Ciclo -> " + image);
         break;
      case 14 :
        image.append(jjstrLiteralImages[14]);
        lengthOfMatch = jjstrLiteralImages[14].length();
                                                                                                                        //14
                System.out.println("Ciclo -> " + image);
                lista.add("Ciclo -> " + image);
         break;
      case 15 :
        image.append(jjstrLiteralImages[15]);
        lengthOfMatch = jjstrLiteralImages[15].length();
                                                                                                                //15
                System.out.println("Ciclo -> " + image);
                lista.add("Ciclo -> " + image);
         break;
      case 16 :
        image.append(jjstrLiteralImages[16]);
        lengthOfMatch = jjstrLiteralImages[16].length();
                                                                                                                //16
                System.out.println("Condicional -> " + image);
                lista.add("Condicional -> " + image);
         break;
      case 17 :
        image.append(jjstrLiteralImages[17]);
        lengthOfMatch = jjstrLiteralImages[17].length();
                                                                                                                        //17
                System.out.println("Palabra reservada -> " + image);
                lista.add("Palabra reservada -> " + image);
         break;
      case 18 :
        image.append(jjstrLiteralImages[18]);
        lengthOfMatch = jjstrLiteralImages[18].length();
                                                                                                                //18
                System.out.println("Palabra reservada -> " + image);
                lista.add("Palabra reservada -> " + image);
         break;
      case 19 :
        image.append(jjstrLiteralImages[19]);
        lengthOfMatch = jjstrLiteralImages[19].length();
                                                                                                                //19
                System.out.println("Palabra reservada -> " + image);
                lista.add("Palabra reservada -> " + image);
         break;
      case 20 :
        image.append(jjstrLiteralImages[20]);
        lengthOfMatch = jjstrLiteralImages[20].length();
                                                                                                                //20
                System.out.println("Palabra reservada -> " + image);
                lista.add("Palabra reservada -> " + image);
         break;
      case 21 :
        image.append(jjstrLiteralImages[21]);
        lengthOfMatch = jjstrLiteralImages[21].length();
                                                                                                                        //21
                System.out.println("Palabra reservada -> " + image);
                lista.add("Palabra reservada -> " + image);
         break;
      case 22 :
        image.append(jjstrLiteralImages[22]);
        lengthOfMatch = jjstrLiteralImages[22].length();
                                                                                                                //22
                System.out.println("Palabra reservada -> " + image);
                lista.add("Palabra reservada -> " + image);
         break;
      case 23 :
        image.append(jjstrLiteralImages[23]);
        lengthOfMatch = jjstrLiteralImages[23].length();
                                                                                                                        //23
                System.out.println("Tipo de variable -> " + image + "(Entero)");
                lista.add("Tipo de variable -> " + image + "(Entero)");
         break;
      case 24 :
        image.append(jjstrLiteralImages[24]);
        lengthOfMatch = jjstrLiteralImages[24].length();
                                                                                                                        //24
                System.out.println("Tipo de variable -> " + image + "(Flotante)");
                lista.add("Tipo de variable -> " + image + "(Flotante)");
         break;
      case 25 :
        image.append(jjstrLiteralImages[25]);
        lengthOfMatch = jjstrLiteralImages[25].length();
                                                                                                                //25
                System.out.println("Tipo de variable -> " + image + "(Cadena)");
                lista.add("Tipo de variable -> " + image + "(Cadena)");
         break;
      case 26 :
        image.append(jjstrLiteralImages[26]);
        lengthOfMatch = jjstrLiteralImages[26].length();
                                                                                                                        //26
                System.out.println("Tipo de variable -> " + image + "(Caracter)");
                lista.add("Tipo de variable -> " + image + "(Caracter)");
         break;
      case 27 :
        image.append(jjstrLiteralImages[27]);
        lengthOfMatch = jjstrLiteralImages[27].length();
                                                                                                                //27
                System.out.println("Tipo de variable -> " + image + "(Caracter)");
                lista.add("Tipo de variable -> " + image + "(Caracter)");
         break;
      case 28 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                                                                //28
                System.out.println("Tipo de dato entero -> " + image);
                lista.add("Tipo de dato entero -> " + image);
         break;
      case 29 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                                //29
                System.out.println("Tipo de dato String -> " + image);
                lista.add("Tipo de dato String -> " + image);
         break;
      case 30 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                                //30
                System.out.println("Tipo de dato caracter -> " + image);
                lista.add("Tipo de dato caracter -> " + image);
         break;
      case 31 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                                        //31
                System.out.println("Tipo de dato flotante -> " + image);
                lista.add("Tipo de dato flotante -> " + image);
         break;
      case 32 :
        image.append(jjstrLiteralImages[32]);
        lengthOfMatch = jjstrLiteralImages[32].length();
                                                                                                                        //32
                System.out.println("Tipo de dato Booleano -> " + image);
                lista.add("Tipo de dato Booleano -> " + image);
         break;
      case 33 :
        image.append(jjstrLiteralImages[33]);
        lengthOfMatch = jjstrLiteralImages[33].length();
                                                                                                                //33
                System.out.println("Tipo de dato Booleano " + image);
                lista.add("Tipo de dato Booleano -> " + image);
         break;
      case 34 :
        image.append(jjstrLiteralImages[34]);
        lengthOfMatch = jjstrLiteralImages[34].length();
                                                                                                                        //34
                System.out.println("Tipo de dato nulo -> " + image);
                lista.add("Tipo de dato nulo -> " + image);
         break;
      case 35 :
        image.append(jjstrLiteralImages[35]);
        lengthOfMatch = jjstrLiteralImages[35].length();
                                                                                                                //35
                System.out.println("Refencia a clase -> " + image);
                lista.add("Refencia a clase -> " + image);
         break;
      case 36 :
        image.append(jjstrLiteralImages[36]);
        lengthOfMatch = jjstrLiteralImages[36].length();
                                                                                                        //36
                System.out.println("Metodo de escritura -> " + image);
                lista.add("Metodo de escritura -> " + image);
         break;
      case 37 :
        image.append(jjstrLiteralImages[37]);
        lengthOfMatch = jjstrLiteralImages[37].length();
                                                                                                                //37
                System.out.println("Metodo de escritura -> " + image);
                lista.add("Metodo de escritura -> " + image);
         break;
      case 38 :
        image.append(jjstrLiteralImages[38]);
        lengthOfMatch = jjstrLiteralImages[38].length();
                                                                                                                //38
                System.out.println("Metodo de lectura -> " + image);
                lista.add("Metodo de lectura -> " + image);
         break;
      case 39 :
        image.append(jjstrLiteralImages[39]);
        lengthOfMatch = jjstrLiteralImages[39].length();
                                                                                                                //39
                System.out.println("Metodo de lectura -> " + image);
                lista.add("Metodo de lectura -> " + image);
         break;
      case 40 :
        image.append(jjstrLiteralImages[40]);
        lengthOfMatch = jjstrLiteralImages[40].length();
                                                                                                                //40
                System.out.println("Llave Izquierda -> " + image);
                lista.add("Llave Izquierda -> " + image);
         break;
      case 41 :
        image.append(jjstrLiteralImages[41]);
        lengthOfMatch = jjstrLiteralImages[41].length();
                                                                                                                //41
                System.out.println("Llave Derecha -> " + image);
                lista.add("Llave Derecha -> " + image);
         break;
      case 42 :
        image.append(jjstrLiteralImages[42]);
        lengthOfMatch = jjstrLiteralImages[42].length();
                                                                                                        //42
                System.out.println("Parentesis -> " + image);
                lista.add("Parentesis -> " + image);
         break;
      case 43 :
        image.append(jjstrLiteralImages[43]);
        lengthOfMatch = jjstrLiteralImages[43].length();
                                                                                                        //43
                System.out.println("Parentesis -> " + image);
                lista.add("Parentesis -> " + image);
         break;
      case 44 :
        image.append(jjstrLiteralImages[44]);
        lengthOfMatch = jjstrLiteralImages[44].length();
                                                                                                                //44
                System.out.println("Cierre de sentencia -> " + image);
                lista.add("Cierre de sentencia -> " + image);
         break;
      case 45 :
        image.append(jjstrLiteralImages[45]);
        lengthOfMatch = jjstrLiteralImages[45].length();
                                                                                                                        //45
                System.out.println("Punto -> " + image);
                lista.add("Punto -> " + image);
         break;
      case 46 :
        image.append(jjstrLiteralImages[46]);
        lengthOfMatch = jjstrLiteralImages[46].length();
                                                                                                                //46
                System.out.println("Dos puntos -> " + image);
                lista.add("Dos puntos -> " + image);
         break;
      case 47 :
        image.append(jjstrLiteralImages[47]);
        lengthOfMatch = jjstrLiteralImages[47].length();
                                                                                                                        //47
                System.out.println("Coma -> " + image);
                lista.add("Coma -> " + image);
         break;
      case 48 :
        image.append(jjstrLiteralImages[48]);
        lengthOfMatch = jjstrLiteralImages[48].length();
                                                                                                        //48
                System.out.println("CorcheteIzquierdo -> " + image);
                lista.add("CorcheteIzquierdo -> " + image);
         break;
      case 49 :
        image.append(jjstrLiteralImages[49]);
        lengthOfMatch = jjstrLiteralImages[49].length();
                                                                                                                //49
                System.out.println("CorcheteDerecho -> " + image);
                lista.add("CorcheteDerecho -> " + image);
         break;
      case 50 :
        image.append(jjstrLiteralImages[50]);
        lengthOfMatch = jjstrLiteralImages[50].length();
                                                                                                                        //50
                System.out.println("Operador aritmetico suma -> " + image);
                lista.add("Operador aritmetico suma -> " + image);
         break;
      case 51 :
        image.append(jjstrLiteralImages[51]);
        lengthOfMatch = jjstrLiteralImages[51].length();
                                                                                                                        //51
                System.out.println("Operador aritmetico resta -> " + image);
                lista.add("Operador aritmetico -> resta " + image);
         break;
      case 52 :
        image.append(jjstrLiteralImages[52]);
        lengthOfMatch = jjstrLiteralImages[52].length();
                                                                                                                //52
                System.out.println("Operador aritmetico multiplicacion -> " + image);
                lista.add("Operador aritmetico multiplicacion -> " + image);
         break;
      case 53 :
        image.append(jjstrLiteralImages[53]);
        lengthOfMatch = jjstrLiteralImages[53].length();
                                                                                                                        //53
                System.out.println("Operador aritmetico division -> " + image);
                lista.add("Operador aritmetico division -> " + image);
         break;
      case 54 :
        image.append(jjstrLiteralImages[54]);
        lengthOfMatch = jjstrLiteralImages[54].length();
                                                                                                                        //54
                System.out.println("Operador aritmetico modulo -> " + image);
                lista.add("Operador aritmetico modulo -> " + image);
         break;
      case 55 :
        image.append(jjstrLiteralImages[55]);
        lengthOfMatch = jjstrLiteralImages[55].length();
                                                                                                                        //55
                System.out.println("Asignacion -> " + image);
                lista.add("Asignacion -> " + image);
         break;
      case 56 :
        image.append(jjstrLiteralImages[56]);
        lengthOfMatch = jjstrLiteralImages[56].length();
                                                                                                                //56
                System.out.println("Asignacion -> " + image);
                lista.add("Asignacion -> " + image);
         break;
      case 57 :
        image.append(jjstrLiteralImages[57]);
        lengthOfMatch = jjstrLiteralImages[57].length();
                                                                                                                //57
                System.out.println("Asignacion -> " + image);
                lista.add("Asignacion -> " + image);
         break;
      case 58 :
        image.append(jjstrLiteralImages[58]);
        lengthOfMatch = jjstrLiteralImages[58].length();
                                                                                                        //58
                System.out.println("Asignacion -> " + image);
                lista.add("Asignacion -> " + image);
         break;
      case 59 :
        image.append(jjstrLiteralImages[59]);
        lengthOfMatch = jjstrLiteralImages[59].length();
                                                                                                                //59
                System.out.println("Asignacion -> " + image);
                lista.add("Asignacion -> " + image);
         break;
      case 60 :
        image.append(jjstrLiteralImages[60]);
        lengthOfMatch = jjstrLiteralImages[60].length();
                                                                                                                //60
                System.out.println("Asignacion -> " + image);
                lista.add("Asignacion -> " + image);
         break;
      case 61 :
        image.append(jjstrLiteralImages[61]);
        lengthOfMatch = jjstrLiteralImages[61].length();
                                                                                                                //61
                System.out.println("Asignacion -> " + image);
                lista.add("Asignacion -> " + image);
         break;
      case 62 :
        image.append(jjstrLiteralImages[62]);
        lengthOfMatch = jjstrLiteralImages[62].length();
                                                                                                                //62
                System.out.println("Asignacion -> " + image);
                lista.add("Asignacion -> " + image);
         break;
      case 63 :
        image.append(jjstrLiteralImages[63]);
        lengthOfMatch = jjstrLiteralImages[63].length();
                                                                                                                        //63
                System.out.println("Operador Relacional -> " + image);
                lista.add("Operador Relacional -> " + image);
         break;
      case 64 :
        image.append(jjstrLiteralImages[64]);
        lengthOfMatch = jjstrLiteralImages[64].length();
                                                                                                                        //64
                System.out.println("Operador Relacional -> " + image);
                lista.add("Operador Relacional -> " + image);
         break;
      case 65 :
        image.append(jjstrLiteralImages[65]);
        lengthOfMatch = jjstrLiteralImages[65].length();
                                                                                                                        //65
                System.out.println("Operador Relacional -> " + image);
                lista.add("Operador Relacional -> " + image);
         break;
      case 66 :
        image.append(jjstrLiteralImages[66]);
        lengthOfMatch = jjstrLiteralImages[66].length();
                                                                                                                //66
                System.out.println("Operador Relacional -> " + image);
                lista.add("Operador Relacional -> " + image);
         break;
      case 67 :
        image.append(jjstrLiteralImages[67]);
        lengthOfMatch = jjstrLiteralImages[67].length();
                                                                                                                //67
                System.out.println("Operador Relacional -> " + image);
                lista.add("Operador Relacional -> " + image);
         break;
      case 68 :
        image.append(jjstrLiteralImages[68]);
        lengthOfMatch = jjstrLiteralImages[68].length();
                                                                                                                //68
                System.out.println("Operador Relacional -> " + image);
                lista.add("Operador Relacional -> " + image);
         break;
      case 69 :
        image.append(jjstrLiteralImages[69]);
        lengthOfMatch = jjstrLiteralImages[69].length();
                                                                                                                        //69
                System.out.println("Operador Logico -> " + image);
                lista.add("Operador Logico -> " + image);
         break;
      case 70 :
        image.append(jjstrLiteralImages[70]);
        lengthOfMatch = jjstrLiteralImages[70].length();
                                                                                                                        //70
                System.out.println("Operador Logico -> " + image);
                lista.add("Operador Logico -> " + image);
         break;
      case 71 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                                                //71
                System.out.println("Identificador -> " + image);
                lista.add("Identificador -> " + image);
         break;
      case 72 :
        image.append(jjstrLiteralImages[72]);
        lengthOfMatch = jjstrLiteralImages[72].length();
                                                                                                                //72
                System.out.println("Comentario de una linea -> " + image);
                lista.add("Comentario de una linea -> " + image);
         break;
      case 73 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
                                                                                                //73
                System.out.println("Comentario de parrafo inicio -> " + image);
                lista.add("Comentario de parrafo inicio -> " + image);
         break;
      case 74 :
        image.append(jjstrLiteralImages[74]);
        lengthOfMatch = jjstrLiteralImages[74].length();
                                                                                                        //74
                System.out.println("Comentario de parrafo termino -> " + image);
                lista.add("Comentario de parrafo termino -> " + image);
         break;
      default :
         break;
   }
}
private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
