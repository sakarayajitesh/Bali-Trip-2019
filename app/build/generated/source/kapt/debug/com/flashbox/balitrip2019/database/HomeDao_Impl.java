package com.flashbox.balitrip2019.database;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.flashbox.balitrip2019.home.Home;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HomeDao_Impl implements HomeDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Home> __insertionAdapterOfHome;

  private final EntityDeletionOrUpdateAdapter<Home> __updateAdapterOfHome;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public HomeDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHome = new EntityInsertionAdapter<Home>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `home_table` (`id`,`name`,`image`,`extra`,`data`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Home value) {
        stmt.bindDouble(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImage());
        }
        if (value.getExtra() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getExtra());
        }
        if (value.getData() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getData());
        }
      }
    };
    this.__updateAdapterOfHome = new EntityDeletionOrUpdateAdapter<Home>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `home_table` SET `id` = ?,`name` = ?,`image` = ?,`extra` = ?,`data` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Home value) {
        stmt.bindDouble(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImage());
        }
        if (value.getExtra() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getExtra());
        }
        if (value.getData() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getData());
        }
        stmt.bindDouble(6, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "delete from home_table";
        return _query;
      }
    };
  }

  @Override
  public void insertAll(final List<Home> items) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHome.insert(items);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int insertData(final Home home) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__updateAdapterOfHome.handle(home);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public List<Home> getAllItems() {
    final String _sql = "select * from home_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfExtra = CursorUtil.getColumnIndexOrThrow(_cursor, "extra");
      final int _cursorIndexOfData = CursorUtil.getColumnIndexOrThrow(_cursor, "data");
      final List<Home> _result = new ArrayList<Home>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Home _item;
        final double _tmpId;
        _tmpId = _cursor.getDouble(_cursorIndexOfId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpImage;
        _tmpImage = _cursor.getString(_cursorIndexOfImage);
        final String _tmpExtra;
        _tmpExtra = _cursor.getString(_cursorIndexOfExtra);
        final String _tmpData;
        _tmpData = _cursor.getString(_cursorIndexOfData);
        _item = new Home(_tmpId,_tmpName,_tmpImage,_tmpExtra,_tmpData);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public String getData(final int id) {
    final String _sql = "select data from home_table where id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final String _result;
      if(_cursor.moveToFirst()) {
        _result = _cursor.getString(0);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
