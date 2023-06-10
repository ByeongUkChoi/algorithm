# Definition for singly-linked list.
#
# defmodule ListNode do
#   @type t :: %__MODULE__{
#           val: integer,
#           next: ListNode.t() | nil
#         }
#   defstruct val: 0, next: nil
# end

defmodule Solution do
  @spec merge_k_lists(lists :: [ListNode.t() | nil]) :: ListNode.t() | nil
  def merge_k_lists(lists) do
    sort_merge(lists)
  end

  defp sort_merge(lists) do
    lists
    |> Enum.reject(&is_nil/1)
    |> sort_merge([])
  end

  defp sort_merge([], acc_list) do
    to_list_node_struct(acc_list)
  end

  defp sort_merge(lists, acc_list) do
    vals = Enum.map(lists, & &1.val)
    min = Enum.min(vals)

    new_lists =
      lists
      |> Enum.map(fn node ->
        if node.val == min do
          node.next
        else
          node
        end
      end)
      |> Enum.reject(&is_nil/1)

    min_vals = Enum.filter(vals, &(&1 == min))
    sort_merge(new_lists, min_vals ++ acc_list)
  end

  defp to_list_node_struct(list, acc_node \\ nil)

  defp to_list_node_struct([], acc_node) do
    acc_node
  end

  defp to_list_node_struct([h | t], acc_node) do
    to_list_node_struct(t, %ListNode{val: h, next: acc_node})
  end
end
