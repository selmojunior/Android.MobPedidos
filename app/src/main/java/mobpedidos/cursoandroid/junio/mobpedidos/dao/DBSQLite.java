package mobpedidos.cursoandroid.junio.mobpedidos.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBSQLite extends SQLiteOpenHelper {

    private static final String DATA_BASE = "mobpedidos.db";
    private static final int VERSAO = 1;

    public DBSQLite(Context context) {
        super(context, DATA_BASE, null, VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql;

        sql = "CREATE TABLE [cliente] (\n" +
                "[id] INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                "[razao] VARCHAR(200)  NOT NULL,\n" +
                "[fantasia] VARCHAR(200)  NULL,\n" +
                "[cnpj_cpf] VARCHAR(20)  NULL,\n" +
                "[ie_rg] VARCHAR(20)  NULL,\n" +
                "[email] VARCHAR(200)  NULL,\n" +
                "[telefone] VARCHAR(50)  NULL,\n" +
                "[limite] NUMERIC(15,2)  NULL,\n" +
                "[endereco] VARCHAR(100)  NULL,\n" +
                "[numero] VARCHAR(10)  NULL,\n" +
                "[complemento] VARCHAR(50)  NULL,\n" +
                "[pontoReferencia] VARCHAR(500)  NULL,\n" +
                "[bairro] VARCHAR(100)  NULL,\n" +
                "[cidade] VARCHAR(100)  NULL,\n" +
                "[UF] NVARCHAR(2)  NULL\n" +
                ")";
        db.execSQL(sql);

        sql = "CREATE TABLE [pedido] (\n" +
                "[id] INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                "[data] DATE  NULL,\n" +
                "[tipo] NVARCHAR(2)  NULL,\n" +
                "[idCliente] INTEGER  NULL,\n" +
                "[idVendedor] INTEGER  NULL,\n" +
                "[idFormaPagto] INTEGER  NULL,\n" +
                "[usuario] VARCHAR(50)  NULL,\n" +
                "[valor] NUMERIC(15,2)  NULL,\n" +
                "[desconto] NUMERIC(15,2)  NULL,\n" +
                "[total] NUMERIC(15,2)  NULL\n" +
                ")";
        db.execSQL(sql);

        sql = "CREATE TABLE [pedidoItem] (\n" +
                "[id] INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                "[idPedido] INTEGER  NULL,\n" +
                "[idProduto] INTEGER  NULL,\n" +
                "[quantidade] REAL  NULL,\n" +
                "[valor] NUMERIC(15,2)  NULL,\n" +
                "[desconto] REAL  NULL,\n" +
                "[total] NUMERIC(15,2)  NULL\n" +
                ")";
        db.execSQL(sql);

        sql = "CREATE TABLE [produto] (\n" +
                "[id] INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                "[codigoBarras] VARCHAR(50)  NULL,\n" +
                "[descricao] VARCHAR(100)  NULL,\n" +
                "[unidade] VARCHAR(10)  NULL,\n" +
                "[categoria] VARCHAR(100)  NULL,\n" +
                "[forncedor] VARCHAR(100)  NULL,\n" +
                "[fabricante] VARCHAR(100)  NULL,\n" +
                "[estoque] REAL  NULL,\n" +
                "[estoqueMin] REAL  NULL,\n" +
                "[estoqueMax] REAL  NULL,\n" +
                "[observacao] VARCHAR(500)  NULL\n" +
                ")";
        db.execSQL(sql);

        sql = "CREATE TABLE [usuario] (\n" +
                "[id] INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                "[login] VARCHAR(100)  NULL\n" +
                ")";
        db.execSQL(sql);

        sql = "CREATE TABLE [vendedor] (\n" +
                "[id] INTEGER  NOT NULL PRIMARY KEY AUTOINCREMENT,\n" +
                "[nome] VARCHAR(100)  NULL,\n" +
                "[idUsuario] INTEGER  NULL\n" +
                ")";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        if (newVersion == 2) {
            //db.execSQL("");
        }

        if (newVersion == 3) {
            //db.execSQL("");
        }

        if (newVersion == 4) {
            //db.execSQL("");
        }

        if (newVersion == 5) {
            //db.execSQL("");
        }
    }

}
