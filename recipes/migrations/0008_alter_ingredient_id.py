# Generated by Django 5.0.4 on 2024-04-11 12:36

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('recipes', '0007_alter_recipe_duration'),
    ]

    operations = [
        migrations.AlterField(
            model_name='ingredient',
            name='id',
            field=models.AutoField(max_length=255, primary_key=True, serialize=False),
        ),
    ]
