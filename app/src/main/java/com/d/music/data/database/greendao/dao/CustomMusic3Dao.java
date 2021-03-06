package com.d.music.data.database.greendao.dao;

import android.database.sqlite.SQLiteDatabase;

import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * DAO for table "CUSTOM_MUSIC3".
 */
public class CustomMusic3Dao extends AbstractMusicDao {

    public static final String TABLENAME = "CUSTOM_MUSIC3";

    public CustomMusic3Dao(DaoConfig config) {
        super(config);
    }

    ;

    public CustomMusic3Dao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /**
     * Creates the underlying database table.
     */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists ? "IF NOT EXISTS " : "";
        db.execSQL("CREATE TABLE " + constraint + "\"" + TABLENAME + "\" (" + //
                "\"ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: id
                "\"TYPE\" INTEGER," + // 1: type
                "\"SEQ\" INTEGER," + // 2: seq
                "\"SONG_ID\" TEXT," + // 3: songId
                "\"SONG_NAME\" TEXT," + // 4: songName
                "\"SONG_URL\" TEXT," + // 5: songUrl
                "\"ARTIST_ID\" TEXT," + // 6: artistId
                "\"ARTIST_NAME\" TEXT," + // 7: artistName
                "\"ALBUM_ID\" TEXT," + // 8: albumId
                "\"ALBUM_NAME\" TEXT," + // 9: albumName
                "\"ALBUM_URL\" TEXT," + // 10: albumUrl
                "\"LRC_NAME\" TEXT," + // 11: lrcName
                "\"LRC_URL\" TEXT," + // 12: lrcUrl
                "\"FILE_DURATION\" INTEGER," + // 13: fileDuration
                "\"FILE_SIZE\" INTEGER," + // 14: fileSize
                "\"FILE_POSTFIX\" TEXT," + // 15: filePostfix
                "\"FILE_FOLDER\" TEXT," + // 16: fileFolder
                "\"IS_COLLECTED\" INTEGER," + // 17: isCollected
                "\"TIME_STAMP\" INTEGER);"); // 18: timeStamp
    }

    /**
     * Drops the underlying database table.
     */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"" + TABLENAME + "\"";
        db.execSQL(sql);
    }

    /**
     * Properties of entity MusicModel.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public static final Property Id = CommonProperties.Id;
        public static final Property Type = CommonProperties.Type;
        public static final Property Seq = CommonProperties.Seq;
        public static final Property SongId = CommonProperties.SongId;
        public static final Property SongName = CommonProperties.SongName;
        public static final Property SongUrl = CommonProperties.SongUrl;
        public static final Property ArtistId = CommonProperties.ArtistId;
        public static final Property ArtistName = CommonProperties.ArtistName;
        public static final Property AlbumId = CommonProperties.AlbumId;
        public static final Property AlbumName = CommonProperties.AlbumName;
        public static final Property AlbumUrl = CommonProperties.AlbumUrl;
        public static final Property LrcName = CommonProperties.LrcName;
        public static final Property LrcUrl = CommonProperties.LrcUrl;
        public static final Property FileDuration = CommonProperties.FileDuration;
        public static final Property FileSize = CommonProperties.FileSize;
        public static final Property FilePostfix = CommonProperties.FilePostfix;
        public static final Property FileFolder = CommonProperties.FileFolder;
        public static final Property IsCollected = CommonProperties.IsCollected;
        public static final Property TimeStamp = CommonProperties.TimeStamp;
    }
}
