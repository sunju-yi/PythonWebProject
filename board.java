// ORM class for table 'board'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Fri Feb 17 10:12:36 KST 2023
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

public class board extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board.this.id = (Long)value;
      }
    });
    setters.put("title", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board.this.title = (String)value;
      }
    });
    setters.put("contents", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board.this.contents = (String)value;
      }
    });
    setters.put("substance", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board.this.substance = (String)value;
      }
    });
    setters.put("write_dttm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board.this.write_dttm = (java.sql.Timestamp)value;
      }
    });
    setters.put("board_name", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board.this.board_name = (String)value;
      }
    });
    setters.put("update_dttm", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board.this.update_dttm = (java.sql.Timestamp)value;
      }
    });
    setters.put("hits", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board.this.hits = (Long)value;
      }
    });
    setters.put("files", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board.this.files = (String)value;
      }
    });
    setters.put("filename", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board.this.filename = (String)value;
      }
    });
    setters.put("accept", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board.this.accept = (Boolean)value;
      }
    });
    setters.put("like_count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board.this.like_count = (Long)value;
      }
    });
    setters.put("dislike_count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board.this.dislike_count = (Long)value;
      }
    });
    setters.put("category", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board.this.category = (String)value;
      }
    });
    setters.put("follow_count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board.this.follow_count = (Long)value;
      }
    });
    setters.put("writer_id", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        board.this.writer_id = (Long)value;
      }
    });
  }
  public board() {
    init0();
  }
  private Long id;
  public Long get_id() {
    return id;
  }
  public void set_id(Long id) {
    this.id = id;
  }
  public board with_id(Long id) {
    this.id = id;
    return this;
  }
  private String title;
  public String get_title() {
    return title;
  }
  public void set_title(String title) {
    this.title = title;
  }
  public board with_title(String title) {
    this.title = title;
    return this;
  }
  private String contents;
  public String get_contents() {
    return contents;
  }
  public void set_contents(String contents) {
    this.contents = contents;
  }
  public board with_contents(String contents) {
    this.contents = contents;
    return this;
  }
  private String substance;
  public String get_substance() {
    return substance;
  }
  public void set_substance(String substance) {
    this.substance = substance;
  }
  public board with_substance(String substance) {
    this.substance = substance;
    return this;
  }
  private java.sql.Timestamp write_dttm;
  public java.sql.Timestamp get_write_dttm() {
    return write_dttm;
  }
  public void set_write_dttm(java.sql.Timestamp write_dttm) {
    this.write_dttm = write_dttm;
  }
  public board with_write_dttm(java.sql.Timestamp write_dttm) {
    this.write_dttm = write_dttm;
    return this;
  }
  private String board_name;
  public String get_board_name() {
    return board_name;
  }
  public void set_board_name(String board_name) {
    this.board_name = board_name;
  }
  public board with_board_name(String board_name) {
    this.board_name = board_name;
    return this;
  }
  private java.sql.Timestamp update_dttm;
  public java.sql.Timestamp get_update_dttm() {
    return update_dttm;
  }
  public void set_update_dttm(java.sql.Timestamp update_dttm) {
    this.update_dttm = update_dttm;
  }
  public board with_update_dttm(java.sql.Timestamp update_dttm) {
    this.update_dttm = update_dttm;
    return this;
  }
  private Long hits;
  public Long get_hits() {
    return hits;
  }
  public void set_hits(Long hits) {
    this.hits = hits;
  }
  public board with_hits(Long hits) {
    this.hits = hits;
    return this;
  }
  private String files;
  public String get_files() {
    return files;
  }
  public void set_files(String files) {
    this.files = files;
  }
  public board with_files(String files) {
    this.files = files;
    return this;
  }
  private String filename;
  public String get_filename() {
    return filename;
  }
  public void set_filename(String filename) {
    this.filename = filename;
  }
  public board with_filename(String filename) {
    this.filename = filename;
    return this;
  }
  private Boolean accept;
  public Boolean get_accept() {
    return accept;
  }
  public void set_accept(Boolean accept) {
    this.accept = accept;
  }
  public board with_accept(Boolean accept) {
    this.accept = accept;
    return this;
  }
  private Long like_count;
  public Long get_like_count() {
    return like_count;
  }
  public void set_like_count(Long like_count) {
    this.like_count = like_count;
  }
  public board with_like_count(Long like_count) {
    this.like_count = like_count;
    return this;
  }
  private Long dislike_count;
  public Long get_dislike_count() {
    return dislike_count;
  }
  public void set_dislike_count(Long dislike_count) {
    this.dislike_count = dislike_count;
  }
  public board with_dislike_count(Long dislike_count) {
    this.dislike_count = dislike_count;
    return this;
  }
  private String category;
  public String get_category() {
    return category;
  }
  public void set_category(String category) {
    this.category = category;
  }
  public board with_category(String category) {
    this.category = category;
    return this;
  }
  private Long follow_count;
  public Long get_follow_count() {
    return follow_count;
  }
  public void set_follow_count(Long follow_count) {
    this.follow_count = follow_count;
  }
  public board with_follow_count(Long follow_count) {
    this.follow_count = follow_count;
    return this;
  }
  private Long writer_id;
  public Long get_writer_id() {
    return writer_id;
  }
  public void set_writer_id(Long writer_id) {
    this.writer_id = writer_id;
  }
  public board with_writer_id(Long writer_id) {
    this.writer_id = writer_id;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof board)) {
      return false;
    }
    board that = (board) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.contents == null ? that.contents == null : this.contents.equals(that.contents));
    equal = equal && (this.substance == null ? that.substance == null : this.substance.equals(that.substance));
    equal = equal && (this.write_dttm == null ? that.write_dttm == null : this.write_dttm.equals(that.write_dttm));
    equal = equal && (this.board_name == null ? that.board_name == null : this.board_name.equals(that.board_name));
    equal = equal && (this.update_dttm == null ? that.update_dttm == null : this.update_dttm.equals(that.update_dttm));
    equal = equal && (this.hits == null ? that.hits == null : this.hits.equals(that.hits));
    equal = equal && (this.files == null ? that.files == null : this.files.equals(that.files));
    equal = equal && (this.filename == null ? that.filename == null : this.filename.equals(that.filename));
    equal = equal && (this.accept == null ? that.accept == null : this.accept.equals(that.accept));
    equal = equal && (this.like_count == null ? that.like_count == null : this.like_count.equals(that.like_count));
    equal = equal && (this.dislike_count == null ? that.dislike_count == null : this.dislike_count.equals(that.dislike_count));
    equal = equal && (this.category == null ? that.category == null : this.category.equals(that.category));
    equal = equal && (this.follow_count == null ? that.follow_count == null : this.follow_count.equals(that.follow_count));
    equal = equal && (this.writer_id == null ? that.writer_id == null : this.writer_id.equals(that.writer_id));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof board)) {
      return false;
    }
    board that = (board) o;
    boolean equal = true;
    equal = equal && (this.id == null ? that.id == null : this.id.equals(that.id));
    equal = equal && (this.title == null ? that.title == null : this.title.equals(that.title));
    equal = equal && (this.contents == null ? that.contents == null : this.contents.equals(that.contents));
    equal = equal && (this.substance == null ? that.substance == null : this.substance.equals(that.substance));
    equal = equal && (this.write_dttm == null ? that.write_dttm == null : this.write_dttm.equals(that.write_dttm));
    equal = equal && (this.board_name == null ? that.board_name == null : this.board_name.equals(that.board_name));
    equal = equal && (this.update_dttm == null ? that.update_dttm == null : this.update_dttm.equals(that.update_dttm));
    equal = equal && (this.hits == null ? that.hits == null : this.hits.equals(that.hits));
    equal = equal && (this.files == null ? that.files == null : this.files.equals(that.files));
    equal = equal && (this.filename == null ? that.filename == null : this.filename.equals(that.filename));
    equal = equal && (this.accept == null ? that.accept == null : this.accept.equals(that.accept));
    equal = equal && (this.like_count == null ? that.like_count == null : this.like_count.equals(that.like_count));
    equal = equal && (this.dislike_count == null ? that.dislike_count == null : this.dislike_count.equals(that.dislike_count));
    equal = equal && (this.category == null ? that.category == null : this.category.equals(that.category));
    equal = equal && (this.follow_count == null ? that.follow_count == null : this.follow_count.equals(that.follow_count));
    equal = equal && (this.writer_id == null ? that.writer_id == null : this.writer_id.equals(that.writer_id));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.title = JdbcWritableBridge.readString(2, __dbResults);
    this.contents = JdbcWritableBridge.readString(3, __dbResults);
    this.substance = JdbcWritableBridge.readString(4, __dbResults);
    this.write_dttm = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.board_name = JdbcWritableBridge.readString(6, __dbResults);
    this.update_dttm = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.hits = JdbcWritableBridge.readLong(8, __dbResults);
    this.files = JdbcWritableBridge.readString(9, __dbResults);
    this.filename = JdbcWritableBridge.readString(10, __dbResults);
    this.accept = JdbcWritableBridge.readBoolean(11, __dbResults);
    this.like_count = JdbcWritableBridge.readLong(12, __dbResults);
    this.dislike_count = JdbcWritableBridge.readLong(13, __dbResults);
    this.category = JdbcWritableBridge.readString(14, __dbResults);
    this.follow_count = JdbcWritableBridge.readLong(15, __dbResults);
    this.writer_id = JdbcWritableBridge.readLong(16, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.id = JdbcWritableBridge.readLong(1, __dbResults);
    this.title = JdbcWritableBridge.readString(2, __dbResults);
    this.contents = JdbcWritableBridge.readString(3, __dbResults);
    this.substance = JdbcWritableBridge.readString(4, __dbResults);
    this.write_dttm = JdbcWritableBridge.readTimestamp(5, __dbResults);
    this.board_name = JdbcWritableBridge.readString(6, __dbResults);
    this.update_dttm = JdbcWritableBridge.readTimestamp(7, __dbResults);
    this.hits = JdbcWritableBridge.readLong(8, __dbResults);
    this.files = JdbcWritableBridge.readString(9, __dbResults);
    this.filename = JdbcWritableBridge.readString(10, __dbResults);
    this.accept = JdbcWritableBridge.readBoolean(11, __dbResults);
    this.like_count = JdbcWritableBridge.readLong(12, __dbResults);
    this.dislike_count = JdbcWritableBridge.readLong(13, __dbResults);
    this.category = JdbcWritableBridge.readString(14, __dbResults);
    this.follow_count = JdbcWritableBridge.readLong(15, __dbResults);
    this.writer_id = JdbcWritableBridge.readLong(16, __dbResults);
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
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(title, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(contents, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(substance, 4 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(write_dttm, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(board_name, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_dttm, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(hits, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(files, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(filename, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(accept, 11 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeLong(like_count, 12 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(dislike_count, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(category, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(follow_count, 15 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(writer_id, 16 + __off, -5, __dbStmt);
    return 16;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeLong(id, 1 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(title, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(contents, 3 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeString(substance, 4 + __off, -1, __dbStmt);
    JdbcWritableBridge.writeTimestamp(write_dttm, 5 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(board_name, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(update_dttm, 7 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeLong(hits, 8 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(files, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(filename, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBoolean(accept, 11 + __off, -7, __dbStmt);
    JdbcWritableBridge.writeLong(like_count, 12 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(dislike_count, 13 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeString(category, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeLong(follow_count, 15 + __off, -5, __dbStmt);
    JdbcWritableBridge.writeLong(writer_id, 16 + __off, -5, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.id = null;
    } else {
    this.id = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.title = null;
    } else {
    this.title = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.contents = null;
    } else {
    this.contents = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.substance = null;
    } else {
    this.substance = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.write_dttm = null;
    } else {
    this.write_dttm = new Timestamp(__dataIn.readLong());
    this.write_dttm.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.board_name = null;
    } else {
    this.board_name = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.update_dttm = null;
    } else {
    this.update_dttm = new Timestamp(__dataIn.readLong());
    this.update_dttm.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.hits = null;
    } else {
    this.hits = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.files = null;
    } else {
    this.files = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.filename = null;
    } else {
    this.filename = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.accept = null;
    } else {
    this.accept = Boolean.valueOf(__dataIn.readBoolean());
    }
    if (__dataIn.readBoolean()) { 
        this.like_count = null;
    } else {
    this.like_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.dislike_count = null;
    } else {
    this.dislike_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.category = null;
    } else {
    this.category = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.follow_count = null;
    } else {
    this.follow_count = Long.valueOf(__dataIn.readLong());
    }
    if (__dataIn.readBoolean()) { 
        this.writer_id = null;
    } else {
    this.writer_id = Long.valueOf(__dataIn.readLong());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.contents) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, contents);
    }
    if (null == this.substance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, substance);
    }
    if (null == this.write_dttm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.write_dttm.getTime());
    __dataOut.writeInt(this.write_dttm.getNanos());
    }
    if (null == this.board_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, board_name);
    }
    if (null == this.update_dttm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_dttm.getTime());
    __dataOut.writeInt(this.update_dttm.getNanos());
    }
    if (null == this.hits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.hits);
    }
    if (null == this.files) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, files);
    }
    if (null == this.filename) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, filename);
    }
    if (null == this.accept) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.accept);
    }
    if (null == this.like_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.like_count);
    }
    if (null == this.dislike_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.dislike_count);
    }
    if (null == this.category) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category);
    }
    if (null == this.follow_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.follow_count);
    }
    if (null == this.writer_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.writer_id);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.id);
    }
    if (null == this.title) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, title);
    }
    if (null == this.contents) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, contents);
    }
    if (null == this.substance) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, substance);
    }
    if (null == this.write_dttm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.write_dttm.getTime());
    __dataOut.writeInt(this.write_dttm.getNanos());
    }
    if (null == this.board_name) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, board_name);
    }
    if (null == this.update_dttm) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.update_dttm.getTime());
    __dataOut.writeInt(this.update_dttm.getNanos());
    }
    if (null == this.hits) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.hits);
    }
    if (null == this.files) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, files);
    }
    if (null == this.filename) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, filename);
    }
    if (null == this.accept) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeBoolean(this.accept);
    }
    if (null == this.like_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.like_count);
    }
    if (null == this.dislike_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.dislike_count);
    }
    if (null == this.category) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, category);
    }
    if (null == this.follow_count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.follow_count);
    }
    if (null == this.writer_id) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.writer_id);
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
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(contents==null?"null":contents, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(substance==null?"null":substance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(write_dttm==null?"null":"" + write_dttm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(board_name==null?"null":board_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_dttm==null?"null":"" + update_dttm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hits==null?"null":"" + hits, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(files==null?"null":files, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(filename==null?"null":filename, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(accept==null?"null":"" + accept, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(like_count==null?"null":"" + like_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dislike_count==null?"null":"" + dislike_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category==null?"null":category, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(follow_count==null?"null":"" + follow_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(writer_id==null?"null":"" + writer_id, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(id==null?"null":"" + id, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(title==null?"null":title, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(contents==null?"null":contents, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(substance==null?"null":substance, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(write_dttm==null?"null":"" + write_dttm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(board_name==null?"null":board_name, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(update_dttm==null?"null":"" + update_dttm, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(hits==null?"null":"" + hits, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(files==null?"null":files, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(filename==null?"null":filename, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(accept==null?"null":"" + accept, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(like_count==null?"null":"" + like_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(dislike_count==null?"null":"" + dislike_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(category==null?"null":category, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(follow_count==null?"null":"" + follow_count, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(writer_id==null?"null":"" + writer_id, delimiters));
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.contents = null; } else {
      this.contents = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.substance = null; } else {
      this.substance = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.write_dttm = null; } else {
      this.write_dttm = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.board_name = null; } else {
      this.board_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.update_dttm = null; } else {
      this.update_dttm = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hits = null; } else {
      this.hits = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.files = null; } else {
      this.files = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.filename = null; } else {
      this.filename = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.accept = null; } else {
      this.accept = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.like_count = null; } else {
      this.like_count = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dislike_count = null; } else {
      this.dislike_count = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.category = null; } else {
      this.category = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.follow_count = null; } else {
      this.follow_count = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.writer_id = null; } else {
      this.writer_id = Long.valueOf(__cur_str);
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
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.id = null; } else {
      this.id = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.title = null; } else {
      this.title = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.contents = null; } else {
      this.contents = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.substance = null; } else {
      this.substance = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.write_dttm = null; } else {
      this.write_dttm = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.board_name = null; } else {
      this.board_name = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.update_dttm = null; } else {
      this.update_dttm = java.sql.Timestamp.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.hits = null; } else {
      this.hits = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.files = null; } else {
      this.files = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.filename = null; } else {
      this.filename = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.accept = null; } else {
      this.accept = BooleanParser.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.like_count = null; } else {
      this.like_count = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.dislike_count = null; } else {
      this.dislike_count = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null")) { this.category = null; } else {
      this.category = __cur_str;
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.follow_count = null; } else {
      this.follow_count = Long.valueOf(__cur_str);
    }

    if (__it.hasNext()) {
        __cur_str = __it.next();
    } else {
        __cur_str = "null";
    }
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.writer_id = null; } else {
      this.writer_id = Long.valueOf(__cur_str);
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    board o = (board) super.clone();
    o.write_dttm = (o.write_dttm != null) ? (java.sql.Timestamp) o.write_dttm.clone() : null;
    o.update_dttm = (o.update_dttm != null) ? (java.sql.Timestamp) o.update_dttm.clone() : null;
    return o;
  }

  public void clone0(board o) throws CloneNotSupportedException {
    o.write_dttm = (o.write_dttm != null) ? (java.sql.Timestamp) o.write_dttm.clone() : null;
    o.update_dttm = (o.update_dttm != null) ? (java.sql.Timestamp) o.update_dttm.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("contents", this.contents);
    __sqoop$field_map.put("substance", this.substance);
    __sqoop$field_map.put("write_dttm", this.write_dttm);
    __sqoop$field_map.put("board_name", this.board_name);
    __sqoop$field_map.put("update_dttm", this.update_dttm);
    __sqoop$field_map.put("hits", this.hits);
    __sqoop$field_map.put("files", this.files);
    __sqoop$field_map.put("filename", this.filename);
    __sqoop$field_map.put("accept", this.accept);
    __sqoop$field_map.put("like_count", this.like_count);
    __sqoop$field_map.put("dislike_count", this.dislike_count);
    __sqoop$field_map.put("category", this.category);
    __sqoop$field_map.put("follow_count", this.follow_count);
    __sqoop$field_map.put("writer_id", this.writer_id);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("id", this.id);
    __sqoop$field_map.put("title", this.title);
    __sqoop$field_map.put("contents", this.contents);
    __sqoop$field_map.put("substance", this.substance);
    __sqoop$field_map.put("write_dttm", this.write_dttm);
    __sqoop$field_map.put("board_name", this.board_name);
    __sqoop$field_map.put("update_dttm", this.update_dttm);
    __sqoop$field_map.put("hits", this.hits);
    __sqoop$field_map.put("files", this.files);
    __sqoop$field_map.put("filename", this.filename);
    __sqoop$field_map.put("accept", this.accept);
    __sqoop$field_map.put("like_count", this.like_count);
    __sqoop$field_map.put("dislike_count", this.dislike_count);
    __sqoop$field_map.put("category", this.category);
    __sqoop$field_map.put("follow_count", this.follow_count);
    __sqoop$field_map.put("writer_id", this.writer_id);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
