// ORM class for table 'board_recom'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Feb 17 11:13:07 KST 2023
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class board_recom extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("user_nickname", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.user_nickname = (String)value;
      }
    });
    setters.put("recom_board1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board1 = (Integer)value;
      }
    });
    setters.put("recom_board2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board2 = (Integer)value;
      }
    });
    setters.put("recom_board3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board3 = (Integer)value;
      }
    });
    setters.put("recom_board4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board4 = (Integer)value;
      }
    });
    setters.put("recom_board5", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board5 = (Integer)value;
      }
    });
    setters.put("recom_board6", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board6 = (Integer)value;
      }
    });
    setters.put("recom_board7", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board7 = (Integer)value;
      }
    });
    setters.put("recom_board8", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board8 = (Integer)value;
      }
    });
    setters.put("recom_board9", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board9 = (Integer)value;
      }
    });
    setters.put("recom_board10", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board10 = (Integer)value;
      }
    });
    setters.put("recom_board11", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board11 = (Integer)value;
      }
    });
    setters.put("recom_board12", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board12 = (Integer)value;
      }
    });
    setters.put("recom_board13", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board13 = (Integer)value;
      }
    });
    setters.put("recom_board14", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board14 = (Integer)value;
      }
    });
    setters.put("recom_board15", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board15 = (Integer)value;
      }
    });
    setters.put("recom_board16", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board16 = (Integer)value;
      }
    });
    setters.put("recom_board17", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board17 = (Integer)value;
      }
    });
    setters.put("recom_board18", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board18 = (Integer)value;
      }
    });
    setters.put("recom_board19", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board19 = (Integer)value;
      }
    });
    setters.put("recom_board20", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board_recom.this.recom_board20 = (Integer)value;
      }
    });
  }
  public board_recom() {
    init0();
  }
  private String user_nickname;
  public String get_user_nickname() {
    return user_nickname;
  }
  public void set_user_nickname(String user_nickname) {
    this.user_nickname = user_nickname;
  }
  public board_recom with_user_nickname(String user_nickname) {
    this.user_nickname = user_nickname;
    return this;
  }
  private Integer recom_board1;
  public Integer get_recom_board1() {
    return recom_board1;
  }
  public void set_recom_board1(Integer recom_board1) {
    this.recom_board1 = recom_board1;
  }
  public board_recom with_recom_board1(Integer recom_board1) {
    this.recom_board1 = recom_board1;
    return this;
  }
  private Integer recom_board2;
  public Integer get_recom_board2() {
    return recom_board2;
  }
  public void set_recom_board2(Integer recom_board2) {
    this.recom_board2 = recom_board2;
  }
  public board_recom with_recom_board2(Integer recom_board2) {
    this.recom_board2 = recom_board2;
    return this;
  }
  private Integer recom_board3;
  public Integer get_recom_board3() {
    return recom_board3;
  }
  public void set_recom_board3(Integer recom_board3) {
    this.recom_board3 = recom_board3;
  }
  public board_recom with_recom_board3(Integer recom_board3) {
    this.recom_board3 = recom_board3;
    return this;
  }
  private Integer recom_board4;
  public Integer get_recom_board4() {
    return recom_board4;
  }
  public void set_recom_board4(Integer recom_board4) {
    this.recom_board4 = recom_board4;
  }
  public board_recom with_recom_board4(Integer recom_board4) {
    this.recom_board4 = recom_board4;
    return this;
  }
  private Integer recom_board5;
  public Integer get_recom_board5() {
    return recom_board5;
  }
  public void set_recom_board5(Integer recom_board5) {
    this.recom_board5 = recom_board5;
  }
  public board_recom with_recom_board5(Integer recom_board5) {
    this.recom_board5 = recom_board5;
    return this;
  }
  private Integer recom_board6;
  public Integer get_recom_board6() {
    return recom_board6;
  }
  public void set_recom_board6(Integer recom_board6) {
    this.recom_board6 = recom_board6;
  }
  public board_recom with_recom_board6(Integer recom_board6) {
    this.recom_board6 = recom_board6;
    return this;
  }
  private Integer recom_board7;
  public Integer get_recom_board7() {
    return recom_board7;
  }
  public void set_recom_board7(Integer recom_board7) {
    this.recom_board7 = recom_board7;
  }
  public board_recom with_recom_board7(Integer recom_board7) {
    this.recom_board7 = recom_board7;
    return this;
  }
  private Integer recom_board8;
  public Integer get_recom_board8() {
    return recom_board8;
  }
  public void set_recom_board8(Integer recom_board8) {
    this.recom_board8 = recom_board8;
  }
  public board_recom with_recom_board8(Integer recom_board8) {
    this.recom_board8 = recom_board8;
    return this;
  }
  private Integer recom_board9;
  public Integer get_recom_board9() {
    return recom_board9;
  }
  public void set_recom_board9(Integer recom_board9) {
    this.recom_board9 = recom_board9;
  }
  public board_recom with_recom_board9(Integer recom_board9) {
    this.recom_board9 = recom_board9;
    return this;
  }
  private Integer recom_board10;
  public Integer get_recom_board10() {
    return recom_board10;
  }
  public void set_recom_board10(Integer recom_board10) {
    this.recom_board10 = recom_board10;
  }
  public board_recom with_recom_board10(Integer recom_board10) {
    this.recom_board10 = recom_board10;
    return this;
  }
  private Integer recom_board11;
  public Integer get_recom_board11() {
    return recom_board11;
  }
  public void set_recom_board11(Integer recom_board11) {
    this.recom_board11 = recom_board11;
  }
  public board_recom with_recom_board11(Integer recom_board11) {
    this.recom_board11 = recom_board11;
    return this;
  }
  private Integer recom_board12;
  public Integer get_recom_board12() {
    return recom_board12;
  }
  public void set_recom_board12(Integer recom_board12) {
    this.recom_board12 = recom_board12;
  }
  public board_recom with_recom_board12(Integer recom_board12) {
    this.recom_board12 = recom_board12;
    return this;
  }
  private Integer recom_board13;
  public Integer get_recom_board13() {
    return recom_board13;
  }
  public void set_recom_board13(Integer recom_board13) {
    this.recom_board13 = recom_board13;
  }
  public board_recom with_recom_board13(Integer recom_board13) {
    this.recom_board13 = recom_board13;
    return this;
  }
  private Integer recom_board14;
  public Integer get_recom_board14() {
    return recom_board14;
  }
  public void set_recom_board14(Integer recom_board14) {
    this.recom_board14 = recom_board14;
  }
  public board_recom with_recom_board14(Integer recom_board14) {
    this.recom_board14 = recom_board14;
    return this;
  }
  private Integer recom_board15;
  public Integer get_recom_board15() {
    return recom_board15;
  }
  public void set_recom_board15(Integer recom_board15) {
    this.recom_board15 = recom_board15;
  }
  public board_recom with_recom_board15(Integer recom_board15) {
    this.recom_board15 = recom_board15;
    return this;
  }
  private Integer recom_board16;
  public Integer get_recom_board16() {
    return recom_board16;
  }
  public void set_recom_board16(Integer recom_board16) {
    this.recom_board16 = recom_board16;
  }
  public board_recom with_recom_board16(Integer recom_board16) {
    this.recom_board16 = recom_board16;
    return this;
  }
  private Integer recom_board17;
  public Integer get_recom_board17() {
    return recom_board17;
  }
  public void set_recom_board17(Integer recom_board17) {
    this.recom_board17 = recom_board17;
  }
  public board_recom with_recom_board17(Integer recom_board17) {
    this.recom_board17 = recom_board17;
    return this;
  }
  private Integer recom_board18;
  public Integer get_recom_board18() {
    return recom_board18;
  }
  public void set_recom_board18(Integer recom_board18) {
    this.recom_board18 = recom_board18;
  }
  public board_recom with_recom_board18(Integer recom_board18) {
    this.recom_board18 = recom_board18;
    return this;
  }
  private Integer recom_board19;
  public Integer get_recom_board19() {
    return recom_board19;
  }
  public void set_recom_board19(Integer recom_board19) {
    this.recom_board19 = recom_board19;
  }
  public board_recom with_recom_board19(Integer recom_board19) {
    this.recom_board19 = recom_board19;
    return this;
  }
  private Integer recom_board20;
  public Integer get_recom_board20() {
    return recom_board20;
  }
  public void set_recom_board20(Integer recom_board20) {
    this.recom_board20 = recom_board20;
  }
  public board_recom with_recom_board20(Integer recom_board20) {
    this.recom_board20 = recom_board20;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof board_recom)) {
      return false;
    }
    board_recom that = (board_recom) o;
    boolean equal = true;
    equal = equal && (this.user_nickname == null ? that.user_nickname == null : this.user_nickname.equals(that.user_nickname));
    equal = equal && (this.recom_board1 == null ? that.recom_board1 == null : this.recom_board1.equals(that.recom_board1));
    equal = equal && (this.recom_board2 == null ? that.recom_board2 == null : this.recom_board2.equals(that.recom_board2));
    equal = equal && (this.recom_board3 == null ? that.recom_board3 == null : this.recom_board3.equals(that.recom_board3));
    equal = equal && (this.recom_board4 == null ? that.recom_board4 == null : this.recom_board4.equals(that.recom_board4));
    equal = equal && (this.recom_board5 == null ? that.recom_board5 == null : this.recom_board5.equals(that.recom_board5));
    equal = equal && (this.recom_board6 == null ? that.recom_board6 == null : this.recom_board6.equals(that.recom_board6));
    equal = equal && (this.recom_board7 == null ? that.recom_board7 == null : this.recom_board7.equals(that.recom_board7));
    equal = equal && (this.recom_board8 == null ? that.recom_board8 == null : this.recom_board8.equals(that.recom_board8));
    equal = equal && (this.recom_board9 == null ? that.recom_board9 == null : this.recom_board9.equals(that.recom_board9));
    equal = equal && (this.recom_board10 == null ? that.recom_board10 == null : this.recom_board10.equals(that.recom_board10));
    equal = equal && (this.recom_board11 == null ? that.recom_board11 == null : this.recom_board11.equals(that.recom_board11));
    equal = equal && (this.recom_board12 == null ? that.recom_board12 == null : this.recom_board12.equals(that.recom_board12));
    equal = equal && (this.recom_board13 == null ? that.recom_board13 == null : this.recom_board13.equals(that.recom_board13));
    equal = equal && (this.recom_board14 == null ? that.recom_board14 == null : this.recom_board14.equals(that.recom_board14));
    equal = equal && (this.recom_board15 == null ? that.recom_board15 == null : this.recom_board15.equals(that.recom_board15));
    equal = equal && (this.recom_board16 == null ? that.recom_board16 == null : this.recom_board16.equals(that.recom_board16));
    equal = equal && (this.recom_board17 == null ? that.recom_board17 == null : this.recom_board17.equals(that.recom_board17));
    equal = equal && (this.recom_board18 == null ? that.recom_board18 == null : this.recom_board18.equals(that.recom_board18));
    equal = equal && (this.recom_board19 == null ? that.recom_board19 == null : this.recom_board19.equals(that.recom_board19));
    equal = equal && (this.recom_board20 == null ? that.recom_board20 == null : this.recom_board20.equals(that.recom_board20));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof board_recom)) {
      return false;
    }
    board_recom that = (board_recom) o;
    boolean equal = true;
    equal = equal && (this.user_nickname == null ? that.user_nickname == null : this.user_nickname.equals(that.user_nickname));
    equal = equal && (this.recom_board1 == null ? that.recom_board1 == null : this.recom_board1.equals(that.recom_board1));
    equal = equal && (this.recom_board2 == null ? that.recom_board2 == null : this.recom_board2.equals(that.recom_board2));
    equal = equal && (this.recom_board3 == null ? that.recom_board3 == null : this.recom_board3.equals(that.recom_board3));
    equal = equal && (this.recom_board4 == null ? that.recom_board4 == null : this.recom_board4.equals(that.recom_board4));
    equal = equal && (this.recom_board5 == null ? that.recom_board5 == null : this.recom_board5.equals(that.recom_board5));
    equal = equal && (this.recom_board6 == null ? that.recom_board6 == null : this.recom_board6.equals(that.recom_board6));
    equal = equal && (this.recom_board7 == null ? that.recom_board7 == null : this.recom_board7.equals(that.recom_board7));
    equal = equal && (this.recom_board8 == null ? that.recom_board8 == null : this.recom_board8.equals(that.recom_board8));
    equal = equal && (this.recom_board9 == null ? that.recom_board9 == null : this.recom_board9.equals(that.recom_board9));
    equal = equal && (this.recom_board10 == null ? that.recom_board10 == null : this.recom_board10.equals(that.recom_board10));
    equal = equal && (this.recom_board11 == null ? that.recom_board11 == null : this.recom_board11.equals(that.recom_board11));
    equal = equal && (this.recom_board12 == null ? that.recom_board12 == null : this.recom_board12.equals(that.recom_board12));
    equal = equal && (this.recom_board13 == null ? that.recom_board13 == null : this.recom_board13.equals(that.recom_board13));
    equal = equal && (this.recom_board14 == null ? that.recom_board14 == null : this.recom_board14.equals(that.recom_board14));
    equal = equal && (this.recom_board15 == null ? that.recom_board15 == null : this.recom_board15.equals(that.recom_board15));
    equal = equal && (this.recom_board16 == null ? that.recom_board16 == null : this.recom_board16.equals(that.recom_board16));
    equal = equal && (this.recom_board17 == null ? that.recom_board17 == null : this.recom_board17.equals(that.recom_board17));
    equal = equal && (this.recom_board18 == null ? that.recom_board18 == null : this.recom_board18.equals(that.recom_board18));
    equal = equal && (this.recom_board19 == null ? that.recom_board19 == null : this.recom_board19.equals(that.recom_board19));
    equal = equal && (this.recom_board20 == null ? that.recom_board20 == null : this.recom_board20.equals(that.recom_board20));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.user_nickname = JdbcWritableBridge.readString(1, __dbResults);
    this.recom_board1 = JdbcWritableBridge.readInteger(2, __dbResults);
    this.recom_board2 = JdbcWritableBridge.readInteger(3, __dbResults);
    this.recom_board3 = JdbcWritableBridge.readInteger(4, __dbResults);
    this.recom_board4 = JdbcWritableBridge.readInteger(5, __dbResults);
    this.recom_board5 = JdbcWritableBridge.readInteger(6, __dbResults);
    this.recom_board6 = JdbcWritableBridge.readInteger(7, __dbResults);
    this.recom_board7 = JdbcWritableBridge.readInteger(8, __dbResults);
    this.recom_board8 = JdbcWritableBridge.readInteger(9, __dbResults);
    this.recom_board9 = JdbcWritableBridge.readInteger(10, __dbResults);
    this.recom_board10 = JdbcWritableBridge.readInteger(11, __dbResults);
    this.recom_board11 = JdbcWritableBridge.readInteger(12, __dbResults);
    this.recom_board12 = JdbcWritableBridge.readInteger(13, __dbResults);
    this.recom_board13 = JdbcWritableBridge.readInteger(14, __dbResults);
    this.recom_board14 = JdbcWritableBridge.readInteger(15, __dbResults);
    this.recom_board15 = JdbcWritableBridge.readInteger(16, __dbResults);
    this.recom_board16 = JdbcWritableBridge.readInteger(17, __dbResults);
    this.recom_board17 = JdbcWritableBridge.readInteger(18, __dbResults);
    this.recom_board18 = JdbcWritableBridge.readInteger(19, __dbResults);
    this.recom_board19 = JdbcWritableBridge.readInteger(20, __dbResults);
    this.recom_board20 = JdbcWritableBridge.readInteger(21, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.user_nickname = JdbcWritableBridge.readString(1, __dbResults);
    this.recom_board1 = JdbcWritableBridge.readInteger(2, __dbResults);
    this.recom_board2 = JdbcWritableBridge.readInteger(3, __dbResults);
    this.recom_board3 = JdbcWritableBridge.readInteger(4, __dbResults);
    this.recom_board4 = JdbcWritableBridge.readInteger(5, __dbResults);
    this.recom_board5 = JdbcWritableBridge.readInteger(6, __dbResults);
    this.recom_board6 = JdbcWritableBridge.readInteger(7, __dbResults);
    this.recom_board7 = JdbcWritableBridge.readInteger(8, __dbResults);
    this.recom_board8 = JdbcWritableBridge.readInteger(9, __dbResults);
    this.recom_board9 = JdbcWritableBridge.readInteger(10, __dbResults);
    this.recom_board10 = JdbcWritableBridge.readInteger(11, __dbResults);
    this.recom_board11 = JdbcWritableBridge.readInteger(12, __dbResults);
    this.recom_board12 = JdbcWritableBridge.readInteger(13, __dbResults);
    this.recom_board13 = JdbcWritableBridge.readInteger(14, __dbResults);
    this.recom_board14 = JdbcWritableBridge.readInteger(15, __dbResults);
    this.recom_board15 = JdbcWritableBridge.readInteger(16, __dbResults);
    this.recom_board16 = JdbcWritableBridge.readInteger(17, __dbResults);
    this.recom_board17 = JdbcWritableBridge.readInteger(18, __dbResults);
    this.recom_board18 = JdbcWritableBridge.readInteger(19, __dbResults);
    this.recom_board19 = JdbcWritableBridge.readInteger(20, __dbResults);
    this.recom_board20 = JdbcWritableBridge.readInteger(21, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(user_nickname, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board1, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board2, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board3, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board4, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board5, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board6, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board7, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board8, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board9, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board10, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board11, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board12, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board13, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board14, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board15, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board16, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board17, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board18, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board19, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board20, 21 + __off, 4, __dbStmt);
    return 21;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(user_nickname, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board1, 2 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board2, 3 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board3, 4 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board4, 5 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board5, 6 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board6, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board7, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board8, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board9, 10 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board10, 11 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board11, 12 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board12, 13 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board13, 14 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board14, 15 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board15, 16 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board16, 17 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board17, 18 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board18, 19 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board19, 20 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(recom_board20, 21 + __off, 4, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.user_nickname = null;
    } else {
    this.user_nickname = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board1 = null;
    } else {
    this.recom_board1 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board2 = null;
    } else {
    this.recom_board2 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board3 = null;
    } else {
    this.recom_board3 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board4 = null;
    } else {
    this.recom_board4 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board5 = null;
    } else {
    this.recom_board5 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board6 = null;
    } else {
    this.recom_board6 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board7 = null;
    } else {
    this.recom_board7 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board8 = null;
    } else {
    this.recom_board8 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board9 = null;
    } else {
    this.recom_board9 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board10 = null;
    } else {
    this.recom_board10 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board11 = null;
    } else {
    this.recom_board11 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board12 = null;
    } else {
    this.recom_board12 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board13 = null;
    } else {
    this.recom_board13 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board14 = null;
    } else {
    this.recom_board14 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board15 = null;
    } else {
    this.recom_board15 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board16 = null;
    } else {
    this.recom_board16 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board17 = null;
    } else {
    this.recom_board17 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board18 = null;
    } else {
    this.recom_board18 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board19 = null;
    } else {
    this.recom_board19 = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.recom_board20 = null;
    } else {
    this.recom_board20 = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.user_nickname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_nickname);
    }
    if (null == this.recom_board1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board1);
    }
    if (null == this.recom_board2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board2);
    }
    if (null == this.recom_board3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board3);
    }
    if (null == this.recom_board4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board4);
    }
    if (null == this.recom_board5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board5);
    }
    if (null == this.recom_board6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board6);
    }
    if (null == this.recom_board7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board7);
    }
    if (null == this.recom_board8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board8);
    }
    if (null == this.recom_board9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board9);
    }
    if (null == this.recom_board10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board10);
    }
    if (null == this.recom_board11) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board11);
    }
    if (null == this.recom_board12) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board12);
    }
    if (null == this.recom_board13) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board13);
    }
    if (null == this.recom_board14) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board14);
    }
    if (null == this.recom_board15) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board15);
    }
    if (null == this.recom_board16) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board16);
    }
    if (null == this.recom_board17) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board17);
    }
    if (null == this.recom_board18) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board18);
    }
    if (null == this.recom_board19) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board19);
    }
    if (null == this.recom_board20) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board20);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.user_nickname) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, user_nickname);
    }
    if (null == this.recom_board1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board1);
    }
    if (null == this.recom_board2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board2);
    }
    if (null == this.recom_board3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board3);
    }
    if (null == this.recom_board4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board4);
    }
    if (null == this.recom_board5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board5);
    }
    if (null == this.recom_board6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board6);
    }
    if (null == this.recom_board7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board7);
    }
    if (null == this.recom_board8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board8);
    }
    if (null == this.recom_board9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board9);
    }
    if (null == this.recom_board10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board10);
    }
    if (null == this.recom_board11) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board11);
    }
    if (null == this.recom_board12) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board12);
    }
    if (null == this.recom_board13) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board13);
    }
    if (null == this.recom_board14) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board14);
    }
    if (null == this.recom_board15) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board15);
    }
    if (null == this.recom_board16) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board16);
    }
    if (null == this.recom_board17) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board17);
    }
    if (null == this.recom_board18) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board18);
    }
    if (null == this.recom_board19) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board19);
    }
    if (null == this.recom_board20) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.recom_board20);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(user_nickname==null?"null":user_nickname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board1==null?"null":"" + recom_board1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board2==null?"null":"" + recom_board2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board3==null?"null":"" + recom_board3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board4==null?"null":"" + recom_board4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board5==null?"null":"" + recom_board5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board6==null?"null":"" + recom_board6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board7==null?"null":"" + recom_board7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board8==null?"null":"" + recom_board8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board9==null?"null":"" + recom_board9, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board10==null?"null":"" + recom_board10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board11==null?"null":"" + recom_board11, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board12==null?"null":"" + recom_board12, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board13==null?"null":"" + recom_board13, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board14==null?"null":"" + recom_board14, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board15==null?"null":"" + recom_board15, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board16==null?"null":"" + recom_board16, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board17==null?"null":"" + recom_board17, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board18==null?"null":"" + recom_board18, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board19==null?"null":"" + recom_board19, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board20==null?"null":"" + recom_board20, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(user_nickname==null?"null":user_nickname, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board1==null?"null":"" + recom_board1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board2==null?"null":"" + recom_board2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board3==null?"null":"" + recom_board3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board4==null?"null":"" + recom_board4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board5==null?"null":"" + recom_board5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board6==null?"null":"" + recom_board6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board7==null?"null":"" + recom_board7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board8==null?"null":"" + recom_board8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board9==null?"null":"" + recom_board9, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board10==null?"null":"" + recom_board10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board11==null?"null":"" + recom_board11, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board12==null?"null":"" + recom_board12, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board13==null?"null":"" + recom_board13, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board14==null?"null":"" + recom_board14, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board15==null?"null":"" + recom_board15, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board16==null?"null":"" + recom_board16, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board17==null?"null":"" + recom_board17, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board18==null?"null":"" + recom_board18, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board19==null?"null":"" + recom_board19, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(recom_board20==null?"null":"" + recom_board20, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.user_nickname = null; } else {
      this.user_nickname = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board1 = null; } else {
      this.recom_board1 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board2 = null; } else {
      this.recom_board2 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board3 = null; } else {
      this.recom_board3 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board4 = null; } else {
      this.recom_board4 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board5 = null; } else {
      this.recom_board5 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board6 = null; } else {
      this.recom_board6 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board7 = null; } else {
      this.recom_board7 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board8 = null; } else {
      this.recom_board8 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board9 = null; } else {
      this.recom_board9 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board10 = null; } else {
      this.recom_board10 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board11 = null; } else {
      this.recom_board11 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board12 = null; } else {
      this.recom_board12 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board13 = null; } else {
      this.recom_board13 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board14 = null; } else {
      this.recom_board14 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board15 = null; } else {
      this.recom_board15 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board16 = null; } else {
      this.recom_board16 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board17 = null; } else {
      this.recom_board17 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board18 = null; } else {
      this.recom_board18 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board19 = null; } else {
      this.recom_board19 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board20 = null; } else {
      this.recom_board20 = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.user_nickname = null; } else {
      this.user_nickname = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board1 = null; } else {
      this.recom_board1 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board2 = null; } else {
      this.recom_board2 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board3 = null; } else {
      this.recom_board3 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board4 = null; } else {
      this.recom_board4 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board5 = null; } else {
      this.recom_board5 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board6 = null; } else {
      this.recom_board6 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board7 = null; } else {
      this.recom_board7 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board8 = null; } else {
      this.recom_board8 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board9 = null; } else {
      this.recom_board9 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board10 = null; } else {
      this.recom_board10 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board11 = null; } else {
      this.recom_board11 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board12 = null; } else {
      this.recom_board12 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board13 = null; } else {
      this.recom_board13 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board14 = null; } else {
      this.recom_board14 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board15 = null; } else {
      this.recom_board15 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board16 = null; } else {
      this.recom_board16 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board17 = null; } else {
      this.recom_board17 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board18 = null; } else {
      this.recom_board18 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board19 = null; } else {
      this.recom_board19 = Integer.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.recom_board20 = null; } else {
      this.recom_board20 = Integer.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    board_recom o = (board_recom) super.clone();
    return o;
  }

  public void clone0(board_recom o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("user_nickname", this.user_nickname);
    __sqoop$field_map.put("recom_board1", this.recom_board1);
    __sqoop$field_map.put("recom_board2", this.recom_board2);
    __sqoop$field_map.put("recom_board3", this.recom_board3);
    __sqoop$field_map.put("recom_board4", this.recom_board4);
    __sqoop$field_map.put("recom_board5", this.recom_board5);
    __sqoop$field_map.put("recom_board6", this.recom_board6);
    __sqoop$field_map.put("recom_board7", this.recom_board7);
    __sqoop$field_map.put("recom_board8", this.recom_board8);
    __sqoop$field_map.put("recom_board9", this.recom_board9);
    __sqoop$field_map.put("recom_board10", this.recom_board10);
    __sqoop$field_map.put("recom_board11", this.recom_board11);
    __sqoop$field_map.put("recom_board12", this.recom_board12);
    __sqoop$field_map.put("recom_board13", this.recom_board13);
    __sqoop$field_map.put("recom_board14", this.recom_board14);
    __sqoop$field_map.put("recom_board15", this.recom_board15);
    __sqoop$field_map.put("recom_board16", this.recom_board16);
    __sqoop$field_map.put("recom_board17", this.recom_board17);
    __sqoop$field_map.put("recom_board18", this.recom_board18);
    __sqoop$field_map.put("recom_board19", this.recom_board19);
    __sqoop$field_map.put("recom_board20", this.recom_board20);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("user_nickname", this.user_nickname);
    __sqoop$field_map.put("recom_board1", this.recom_board1);
    __sqoop$field_map.put("recom_board2", this.recom_board2);
    __sqoop$field_map.put("recom_board3", this.recom_board3);
    __sqoop$field_map.put("recom_board4", this.recom_board4);
    __sqoop$field_map.put("recom_board5", this.recom_board5);
    __sqoop$field_map.put("recom_board6", this.recom_board6);
    __sqoop$field_map.put("recom_board7", this.recom_board7);
    __sqoop$field_map.put("recom_board8", this.recom_board8);
    __sqoop$field_map.put("recom_board9", this.recom_board9);
    __sqoop$field_map.put("recom_board10", this.recom_board10);
    __sqoop$field_map.put("recom_board11", this.recom_board11);
    __sqoop$field_map.put("recom_board12", this.recom_board12);
    __sqoop$field_map.put("recom_board13", this.recom_board13);
    __sqoop$field_map.put("recom_board14", this.recom_board14);
    __sqoop$field_map.put("recom_board15", this.recom_board15);
    __sqoop$field_map.put("recom_board16", this.recom_board16);
    __sqoop$field_map.put("recom_board17", this.recom_board17);
    __sqoop$field_map.put("recom_board18", this.recom_board18);
    __sqoop$field_map.put("recom_board19", this.recom_board19);
    __sqoop$field_map.put("recom_board20", this.recom_board20);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
