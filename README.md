# Dokumentasi Aplikasi Pengelolaan Kontak

## Instruksi Penggunaan Aplikasi

### Langkah 1: Membuat Database SQLite
1. **Buat Database SQLite**
   - Database SQLite dapat dibuat dengan cara manual menggunakan terminal atau aplikasi database management seperti DB Browser for SQLite. Buat database bernama `kontak` setelah itu simpan database tersebut kedalam folder `db`.

### Langkah 2: Membuat Tabel
1. **Membuat Tabel di SQLite**
   - Tabel `kontak` harus memiliki kolom sebagai berikut:
     - `id` (INTEGER, PRIMARY KEY, AUTOINCREMENT) - ID auto increment untuk setiap record.
     - `nama` (TEXT) - Nama dari kontak.
     - `kategori` (TEXT) - Kategori dari kontak (misalnya, "Pribadi", "Kerja", dll).
     - `no_telp` (TEXT) - Nomor telepon kontak.

   **Query untuk membuat tabel `kontak`:**

   ```sql
   CREATE TABLE kontak (
       id INTEGER PRIMARY KEY AUTOINCREMENT,
       nama TEXT,
       kategori TEXT,
       no_telp TEXT
   );
