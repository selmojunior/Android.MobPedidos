package mobpedidos.cursoandroid.junio.mobpedidos.dao;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

import mobpedidos.cursoandroid.junio.mobpedidos.model.Cliente;

public class ClienteDAO {

    public Context context;
    public DBSQLite dbsqLite;
    private static final String TABELA = "cliente";

    public ClienteDAO(Context context) {
        this.context = context;
        dbsqLite = new DBSQLite(this.context);
    }

    public Long inserir(Cliente cliente) {
        SQLiteDatabase db = this.dbsqLite.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("razao", cliente.getRazao());
        contentValues.put("fantasia", cliente.getFantasia());
        contentValues.put("cnpj_cpf", cliente.getCnpj_cpf());
        contentValues.put("ie_rg", cliente.getIe_rg());
        contentValues.put("email", cliente.getEmail());
        contentValues.put("telefone", cliente.getTelefone());
        contentValues.put("limite", cliente.getLimite());
        contentValues.put("endereco", cliente.getEndereco());
        contentValues.put("numero", cliente.getNumero());
        contentValues.put("complemento", cliente.getComplemento());
        contentValues.put("pontoReferencia", cliente.getPontoReferencia());
        contentValues.put("bairro", cliente.getBairro());
        contentValues.put("cidade", cliente.getCidade());
        contentValues.put("uf", cliente.getUf());
        Long id = db.insert(this.TABELA, null, contentValues);
        db.close();
        return id;
    }

    public boolean alterar(Cliente cliente) {
        SQLiteDatabase db = this.dbsqLite.getWritableDatabase();
        ContentValues cValues = new ContentValues();

        cValues.put("razao", cliente.getRazao());
        cValues.put("fantasia", cliente.getFantasia());
        cValues.put("cnpj_cpf", cliente.getCnpj_cpf());
        cValues.put("ie_rg", cliente.getIe_rg());
        cValues.put("email", cliente.getEmail());
        cValues.put("telefone", cliente.getTelefone());
        cValues.put("limite", cliente.getLimite());
        cValues.put("endereco", cliente.getEndereco());
        cValues.put("numero", cliente.getNumero());
        cValues.put("complemento", cliente.getComplemento());
        cValues.put("pontoReferencia", cliente.getPontoReferencia());
        cValues.put("bairro", cliente.getBairro());
        cValues.put("cidade", cliente.getCidade());
        cValues.put("uf", cliente.getUf());

        String sWhere = "id = ?";
        String[] sArgs = {String.valueOf(cliente.getId())};

        int id = db.update(this.TABELA, cValues, sWhere, sArgs);
        db.close();

        return id > 0 ? true : false;
    }

    public boolean excluir(Cliente cliente) {
        return this.excluir(cliente.getId());
    }

    public boolean excluir(int id) {
        SQLiteDatabase db = this.dbsqLite.getWritableDatabase();
        String sWhere = "id = ?";
        String[] sArgs = {String.valueOf(id)};
        id = db.delete(this.TABELA, sWhere, sArgs);
        db.close();
        return id > 0 ? true : false;
    }

    public ArrayList<Cliente> Listar() {
        SQLiteDatabase db = dbsqLite.getReadableDatabase();
        ArrayList<Cliente> lista = new ArrayList<>();

        String sql = "SELECT * FROM " + this.TABELA + " ORDER BY id DESC";

        Cursor cursor = db.rawQuery(sql, null);
        Cliente cliente;

        if (cursor.moveToFirst()) {
            do {
                cliente = new Cliente();
                cliente.setId(cursor.getInt(cursor.getColumnIndex("id")));
                cliente.setRazao(cursor.getString(cursor.getColumnIndex("razao")));
                cliente.setFantasia(cursor.getString(cursor.getColumnIndex("fantasia")));
                cliente.setCnpj_cpf(cursor.getString(cursor.getColumnIndex("cnpj_cpf")));
                cliente.setIe_rg(cursor.getString(cursor.getColumnIndex("ie_rg")));
                cliente.setEmail(cursor.getString(cursor.getColumnIndex("email")));
                cliente.setTelefone(cursor.getString(cursor.getColumnIndex("telefone")));
                cliente.setLimite(cursor.getDouble(cursor.getColumnIndex("limite")));
                cliente.setEndereco(cursor.getString(cursor.getColumnIndex("endereco")));
                cliente.setNumero(cursor.getString(cursor.getColumnIndex("numero")));
                cliente.setComplemento(cursor.getString(cursor.getColumnIndex("complemento")));
                cliente.setPontoReferencia(cursor.getString(cursor.getColumnIndex("pontoReferencia")));
                cliente.setBairro(cursor.getString(cursor.getColumnIndex("bairro")));
                cliente.setCidade(cursor.getString(cursor.getColumnIndex("cidade")));
                cliente.setUf(cursor.getString(cursor.getColumnIndex("uf")));
                lista.add(cliente);
            } while (cursor.moveToNext());

            db.close();
        }

        return lista;
    }

}
