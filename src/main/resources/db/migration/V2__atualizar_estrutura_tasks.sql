ALTER TABLE tarefas RENAME TO tasks;
ALTER TABLE tasks RENAME  COLUMN titulo TO name;
ALTER TABLE tasks RENAME  COLUMN descricao TO description;
ALTER TABLE tasks RENAME  COLUMN concluida TO completed;
ALTER TABLE tasks DROP COLUMN criada_em;